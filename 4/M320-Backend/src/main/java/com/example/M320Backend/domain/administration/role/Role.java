package com.example.M320Backend.domain.administration.role;

import com.example.M320Backend.config.generic.ExtendedEntity;
import com.example.M320Backend.domain.administration.authority.Authority;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "movie_overview_roles")
public class Role extends ExtendedEntity {

    @Column(name = "name")
    private String roleName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "movie_overview_roles_authorities",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "auth_id", referencedColumnName = "id")
    )
    private Set<Authority> roleAuth;

    public Role(Long id, String roleName, Set<Authority> roleAuth) {
        super(id);
        this.roleName = roleName;
        this.roleAuth = roleAuth;
    }
}
