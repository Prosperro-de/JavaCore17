package org.example.module13.botdemo;

import lombok.Data;
import org.example.module13.botdemo.model.QuizResponseApiDto;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Data
public class Quiz {
    private List<QuizResponseApiDto> quizList;
    private AtomicInteger counter = new AtomicInteger();
    private String lastCorrectAnswer;

    public Quiz(List<QuizResponseApiDto> quizList) {
        this.quizList = quizList;
    }
}
