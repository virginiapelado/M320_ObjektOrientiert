package com.example.M320Backend.config.generic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtendedJpaRepository<T extends ExtendedEntity> extends JpaRepository<T, Long> {
}

