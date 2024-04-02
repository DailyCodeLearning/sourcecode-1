package com.quiz.services;

import com.quiz.entities.Question;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url="http://localhost:8082" ,value="Question-Client")
//to make load balancing
@FeignClient(name="QUESTION-SERVICE")
public interface QuestionClient {
    @GetMapping("question/quiz/{quizId}")
    List<Question> getQuestionsOfQuiz(@PathVariable Long quizId);
}
