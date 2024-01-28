package com.example.M320Backend.domain.movieQuiz;

import com.example.M320Backend.config.generic.ExtendedService;
import com.example.M320Backend.domain.category.Category;
import com.example.M320Backend.domain.category.CategoryRepository;
import com.example.M320Backend.domain.movies.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuizService extends ExtendedService<MovieQuiz> {
    protected final String noIDFoundErrorMsg = "An error occurred during the quiz, please try again";

    private CategoryRepository categoryRepository;
    private QuizRepository quizRepository;

    @Autowired
    public QuizService(QuizRepository quizRepository, CategoryRepository categoryRepository) {
        super(quizRepository);
        this.quizRepository = quizRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<MovieQuiz> findAll() {
        return quizRepository.findAll();
    }

    @Override
    public MovieQuiz save(MovieQuiz answer) {
        return quizRepository.save(answer);
    }

    /**
     * Get the recommended category based on the chosen answers.
     * Returns the first movie in the recommended category.
     *
     * @return Recommended category and the first movie in that category
     */
    public Map<String, Object> getRecommendedCategoryWithFirstMovie() {
        List<MovieQuiz> allAnswers = quizRepository.findAll();
        String mostChosenAnswer = getMostChosenAnswer(allAnswers);

        if (mostChosenAnswer != null) {
            Category recommendedCategory = getCategoryByChosenAnswer(mostChosenAnswer);
            Movies firstMovieInCategory = getFirstMovieInCategory(recommendedCategory);

            Map<String, Object> result = new HashMap<>();
            result.put("recommendedCategory", recommendedCategory);
            result.put("firstMovieInCategory", firstMovieInCategory);
            return result;
        }

        throw new NoSuchElementException(String.format(noIDFoundErrorMsg));
    }

    private Category getCategoryByChosenAnswer(String chosenAnswer) {
        switch (chosenAnswer) {
            case "A":
                return getCategoryByName("Action");
            case "B":
                return getCategoryByName("Psychological");
            case "C":
                return getCategoryByName("Comedy");
            case "D":
                return getCategoryByName("Animation");
            case "E":
                return getCategoryByName("Romance");
            default:
                return getCategoryByName("Action");
            }
    }

    private String getMostChosenAnswer(List<MovieQuiz> allAnswers) {
        Map<String, Long> answerCounts = new HashMap<>();

        for (MovieQuiz quiz : allAnswers) {
            String chosenAnswer = quiz.getChosenAnswer();
            answerCounts.put(chosenAnswer, answerCounts.getOrDefault(chosenAnswer, 0L) + 1);
        }

        String mostChosenAnswer = null;
        long maxCount = 0;

        for (Map.Entry<String, Long> entry : answerCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostChosenAnswer = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostChosenAnswer;
    }

    private Movies getFirstMovieInCategory(Category category) {
        Set<Movies> moviesInCategory = category.getMovies();
        if (moviesInCategory != null && !moviesInCategory.isEmpty()) {
            return moviesInCategory.iterator().next();
        }
        return null;
    }

    private Category getCategoryByName(String categoryName) {
        return categoryRepository.findByCategory(categoryName);
    }
}
