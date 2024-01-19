package com.example.M320Backend.domain.movies.reviews;

import com.example.M320Backend.domain.movies.exceptions.MovieOverviewExceptions;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ReviewsService {

    @Autowired
    private ReviewsRepository repository;

    public Reviews getReview(Integer id) throws MovieOverviewExceptions {
        log.info(id + " review found");
        return repository.findById(id).orElseThrow(() -> new MovieOverviewExceptions("ID: "+ id + " of review not found"));
    }

    public Reviews createReview(Reviews reviews) {
        log.info("review created: " + reviews);
        return repository.save(reviews);
    }

    public Reviews updateReviews(Reviews reviews, Integer id) throws MovieOverviewExceptions  {
        if(repository.existsById(id)) {
            reviews.setId(id);
            return repository.save(reviews);
        }
        return repository.findById(id).orElseThrow(() -> new MovieOverviewExceptions("ID: "+ id + " of review not found"));
    }

    public void deleteReview(Integer id) {
        log.info(id + " of review deleted");
        repository.deleteById(id);
    }
}
