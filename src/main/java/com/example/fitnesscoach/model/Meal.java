package com.example.fitnesscoach.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Meal name is required")
    private String name;

    @NotBlank(message = "Meal description is required")
    private String description;

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MealItem> mealItems;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDate date;

    // constructors, getters and setters, and other methods
}
