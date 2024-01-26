package com.example.M320Backend.domain.category;

import com.example.M320Backend.config.generic.ExtendedJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends ExtendedJpaRepository<Category> {
    Category findByCategory(String category);

}
