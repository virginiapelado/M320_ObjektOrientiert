package com.example.M320Backend.domain.administration.user;

import com.example.M320Backend.config.generic.ExtendedEntity;
import com.example.M320Backend.domain.administration.role.Role;
import com.example.M320Backend.domain.reviews.Reviews;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "movie_overview_users")
public class User extends ExtendedEntity {
    @Column(name="name")
    @Size(min = 1, max = 125)
    private String username;

    @Size(min = 1, max = 125)
    private String email;

    @Size(min = 1, max = 255)
    private String password;

    @ManyToOne
    @JoinTable(
            name = "movie_overview_users_roles",
            joinColumns = {
                    @JoinColumn(name = "user_id", referencedColumnName = "id"),
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "role_id", referencedColumnName = "id")
            }
    )
    private Role userRoles;

    public User(Long id, String username, String email, String password, Role userRoles) {
        super(id);
        this.username = username;
        this.email = email;
        this.password = password;
        this.userRoles = userRoles;
    }
}
