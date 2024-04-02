package com.quiz.services;

import com.quiz.entities.Quiz;
import com.quiz.repositories.QuizRepository;

import java.util.List;

public interface QuizService {
    Quiz add(Quiz quiz);

    List<Quiz> getQuizList();

    Quiz getQuiz(Long id);

}
