package com.example.M320Backend.domain.role;

import com.example.M320Backend.domain.authority.Authority;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "movie_overview_roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private Integer roleId;

    @Column(name="name")
    private String roleName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "movie_overview_roles_authorities",
            joinColumns = {
                    @JoinColumn(name = "role_id", referencedColumnName = "role_id"),
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "auth_id", referencedColumnName = "auth_id")
            }
    )
    private Set<Authority> roleAuth;
}
