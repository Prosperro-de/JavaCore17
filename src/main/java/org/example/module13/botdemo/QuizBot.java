package org.example.module13.botdemo;

import org.example.module13.botdemo.client.QuizClient;
import org.example.module13.botdemo.model.QuizResponseApiDto;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Contact;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import static org.example.module13.botdemo.BotConstants.*;

public class QuizBot extends TelegramLongPollingBot {
    private QuizClient quizClient = new QuizClient();
    private Map<String, Quiz> contex = new ConcurrentHashMap<>();

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage message = new SendMessage();
        String chatId = update.getMessage().getChatId().toString();
        message.setChatId(chatId);

        if (isMessagePresent(update) && update.getMessage().getText().equalsIgnoreCase(START)) {
            List<QuizResponseApiDto> defaultQuiz = quizClient.getDefaultQuiz();
            contex.put(chatId, new Quiz(defaultQuiz));
            message.setText(String.format("Quiz is ready and contains %s questions. Press %s to start", defaultQuiz.size(), BEGIN));
            message.setReplyMarkup(setupBeginButton());
        } else if (isMessagePresent(update) && update.getMessage().getText().equalsIgnoreCase(BEGIN)) {
            sendNextMessage(chatId, message);
        } else {
            String currentAnswer = update.getMessage().getText();
            Quiz quiz = contex.get(chatId);
            if (currentAnswer.equalsIgnoreCase(quiz.getLastCorrectAnswer())) {
                sendNextMessage(chatId, message);
            } else {
                message.setText("Incorrect answer. Please try again");
            }
        }
        try {
            execute(message); // Call method to send the message
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void logUser(Contact contact) {
        System.out.println(contact.getFirstName());
    }


    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    private void sendNextMessage(String chatId, SendMessage message) {
        Quiz quiz = contex.get(chatId);
        List<QuizResponseApiDto> quizList = quiz.getQuizList();
        AtomicInteger counter = quiz.getCounter();
        if (quizList.size() > counter.get()) {
            QuizResponseApiDto quizResponseApiDto = quizList.get(counter.addAndGet(1));
            message.setText(quizResponseApiDto.getQuestion());
            message.setReplyMarkup(setupQuizKeyboard(quizResponseApiDto));
            String correctAnswerKey = findCorrectAnswers(quizResponseApiDto.getCorrectAnswers());
            quiz.setLastCorrectAnswer(quizResponseApiDto.getAnswers().get(correctAnswerKey));
        } else {
            message.setText("Quiz is completed");
            quiz.setLastCorrectAnswer(null);
        }
    }

    private ReplyKeyboard setupBeginButton() {
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        row.add(BEGIN);
        keyboard.setKeyboard(List.of(row));
        return keyboard;
    }

    private ReplyKeyboard setupQuizKeyboard(QuizResponseApiDto responseApiDto) {
        ReplyKeyboardMarkup keyboard = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = responseApiDto.getAnswers().entrySet()
                .stream()
                .filter(entry -> entry.getValue() != null)
                .map(entry -> {
                    KeyboardRow row = new KeyboardRow();
                    row.add(entry.getValue());
                    return row;
                })
                .toList();
        keyboard.setKeyboard(rows);
        return keyboard;
    }

    private String findCorrectAnswers(Map<String, String> correctAnswers) {
        String result = correctAnswers.entrySet().stream()
                .filter(entry -> entry.getValue().equals("true"))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow();
        return result.replace("_correct", "");
    }

    private static boolean isMessagePresent(Update update) {
        return update.hasMessage() && update.getMessage().hasText();
    }
}
