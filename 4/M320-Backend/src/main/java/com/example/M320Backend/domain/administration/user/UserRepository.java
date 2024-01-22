package com.example.M320Backend.domain.administration.user;

import com.example.M320Backend.config.generic.ExtendedJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends ExtendedJpaRepository<User> {
    Optional<User> findByUsername(String username);

    @Override
    Optional<User> findById(Long aLong);
}