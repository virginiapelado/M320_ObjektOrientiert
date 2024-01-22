package com.example.M320Backend.config.generic;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class ExtendedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    protected ExtendedEntity() {
    }

    protected ExtendedEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public ExtendedEntity setId(Long id) {
        this.id = id;
        return this;
    }
}
