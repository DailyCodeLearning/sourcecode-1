package com.question.services;

import com.question.entities.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);
    List<Question> getAllQuestions();

    Question getQuestion(Long id);

    void deleteQuestion(Long id);

    List<Question> getQuestionsOfQuiz(Long id);

}
