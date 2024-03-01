package org.example.module13.botdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/*
{
    "id": 1,
    "question": "How to delete a directory in Linux?",
    "description": "delete folder",
    "answers": {
      "answer_a": "ls",
      "answer_b": "delete",
      "answer_c": "remove",
      "answer_d": "rmdir",
      "answer_e": null,
      "answer_f": null
    },
    "multiple_correct_answers": "false",
    "correct_answers": {
      "answer_a_correct": "false",
      "answer_b_correct": "false",
      "answer_c_correct": "false",
      "answer_d_correct": "true",
      "answer_e_correct": "false",
      "answer_f_correct": "false"
    },
    "explanation": "rmdir deletes an empty directory",
    "tip": null,
    "tags": [],
    "category": "linux",
    "difficulty": "Easy"
  }

  MVP
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuizResponseApiDto {
    private Long id;
    private String question;
    private String description;
    private Map<String, String> answers;
    @JsonProperty(value = "multiple_correct_answers")
    private String multipleCorrectAnswers;
    @JsonProperty(value = "correct_answers")
    private Map<String, String> correctAnswers;
    private String correctAnswer;
    private String explanation;
    private String tip;
    private List<Tag> tags;
    private String category;
    private String difficulty;
}
