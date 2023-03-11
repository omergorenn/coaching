package com.example.fitnesscoach.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Email(message = "Invalid email address")
    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "users")
    private List<Meal> meals;

    @OneToMany(mappedBy = "users")
    private List<Workout> workouts;

}
