package com.example.M320Backend.domain.user;

import com.example.M320Backend.domain.role.Role;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "movie_overview_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Integer userId;
    private String username;
    private String password;
    @ManyToOne
    @JoinTable(
            name = "movie_overview_users_roles",
            joinColumns = @JoinColumn (name = "user_id", referencedColumnName = "user_id"),
            inverseJoinColumns = @JoinColumn
                    (name = "role_id", referencedColumnName = "role_id")
    )
    private Role userRoles;
}