package com.question.controller;

import com.question.entities.Question;
import com.question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionControler {
    @Autowired
    private QuestionService questionService;

@PostMapping
    public Question addQuestion(@RequestBody Question question){
        return questionService.create(question);
    }

    @GetMapping
    public List<Question> getAllQuestion(){
    return questionService.getAllQuestions();
    }
    @GetMapping("/{id}")
    public Question getQuestion(@PathVariable Long id){
return  questionService.getQuestion(id);
    }
@DeleteMapping("/{id}")
    public void deleteQuetion(@PathVariable Long id){
    questionService.deleteQuestion(id);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
    return questionService.getQuestionsOfQuiz(quizId);
    }

}
