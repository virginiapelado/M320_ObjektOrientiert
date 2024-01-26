package com.example.M320Backend.config.generic;

import java.util.NoSuchElementException;
import java.util.Optional;

public abstract class ExtendedService<T extends ExtendedEntity> {
    protected final String noIDFoundErrorMsg = "ID '%s' of movie not found";
    protected final ExtendedJpaRepository<T> repository;
    protected ExtendedService(ExtendedJpaRepository<T> repository) {
        this.repository = repository;
    }

    public T findById(Long id) {
        Optional<T> optional = repository.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new NoSuchElementException(String.format(noIDFoundErrorMsg, id));
        }
    }

    public T save(T entity) {
        return repository.save(entity);
    }

    public T updateById(Long id, T entity) {
        if (repository.existsById(id)) {
            entity.setId(id);
            return repository.save(entity);
        } else {
            throw new NoSuchElementException(String.format(noIDFoundErrorMsg, id));
        }
    }

    public void deleteById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new NoSuchElementException(String.format(noIDFoundErrorMsg, id));
        }
    }
}
