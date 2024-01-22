package com.example.M320Backend.domain.reviews;

import com.example.M320Backend.config.generic.ExtendedService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Log4j2
public class ReviewsService extends ExtendedService<Reviews> {
    protected final String noIDFoundErrorMsg = "ID '%s' of Review not found";

    private ReviewsRepository reviewsRepository;

    @Autowired
    protected ReviewsService(ReviewsRepository repository) {
        super(repository);
        this.reviewsRepository = repository;
    }

    public List<Reviews> findReviewsByMovieId(Long movieId) {
        return reviewsRepository.findByMovie_Id(movieId);
    }

    @Override
    public Reviews findById(Long id) {
        Optional<Reviews> optional = reviewsRepository.findById(id);

        if (optional.isPresent()) {
            log.info(id + " review found");
            return optional.get();
        } else {
            throw new NoSuchElementException(String.format(noIDFoundErrorMsg, id));
        }
    }

    @Override
    public Reviews save(Reviews entity) {
        log.info("review created: " + entity.getId());
        return reviewsRepository.save(entity);
    }

    @Override
    public Reviews updateById(Long id, Reviews entity) {
        if (reviewsRepository.existsById(id)) {
            entity.setId(id);
            log.info(id + " of review updated");
            return reviewsRepository.save(entity);
        } else {
            throw new NoSuchElementException(String.format(noIDFoundErrorMsg, id));
        }
    }

    @Override
    public void deleteById(Long id) {
        if (reviewsRepository.existsById(id)) {
            log.info(id + " of review deleted");
            reviewsRepository.deleteById(id);
        } else {
            throw new NoSuchElementException(String.format(noIDFoundErrorMsg, id));
        }
    }
}