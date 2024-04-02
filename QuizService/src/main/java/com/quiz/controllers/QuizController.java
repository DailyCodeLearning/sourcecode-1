package com.quiz.controllers;

import com.quiz.entities.Quiz;
import com.quiz.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return  quizService.add(quiz);
    }

   @GetMapping
   public List<Quiz> getQuizList(){
        return quizService.getQuizList();

   }
   @GetMapping("/{id}")
   public Quiz getQuiz(@PathVariable Long id){
        return  quizService.getQuiz(id);
   }
}
