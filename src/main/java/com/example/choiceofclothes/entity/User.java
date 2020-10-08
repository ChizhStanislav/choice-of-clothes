package com.example.choiceofclothes.entity;

import com.example.choiceofclothes.dictonary.Role;
import lombok.*;

import javax.persistence.*;

@Builder
@Setter
@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users", schema = "public")
public class User extends BaseEntity<Long> {

    @Builder
    public User(Long id, String username, String password, Role role) {
        super(id);
        this.username = username;
        this.password = password;
        this.role = role;
    }

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
