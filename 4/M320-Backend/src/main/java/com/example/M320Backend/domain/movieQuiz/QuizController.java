package com.example.M320Backend.domain.movieQuiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/movies/quiz")
public class QuizController {
    private QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public ResponseEntity<List<MovieQuiz>> getAllQuizzes() {
        return ResponseEntity.ok(quizService.findAll());
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> submitAnswer(@RequestBody MovieQuiz answer) {
        quizService.save(answer);
        return ResponseEntity.ok(quizService.getRecommendedCategoryWithFirstMovie());
    }
}
