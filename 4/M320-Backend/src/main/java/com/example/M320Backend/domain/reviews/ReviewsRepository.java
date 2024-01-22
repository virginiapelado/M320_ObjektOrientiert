package com.example.M320Backend.domain.reviews;

import com.example.M320Backend.config.generic.ExtendedJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewsRepository extends ExtendedJpaRepository<Reviews> {
    List<Reviews> findByMovie_Id(Long id);
}
