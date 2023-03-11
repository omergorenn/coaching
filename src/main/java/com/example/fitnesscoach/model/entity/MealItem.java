package com.example.fitnesscoach.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name="meal_items")
public class MealItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private int calories;
    @Column(nullable = false)
    private int protein;
    @Column(nullable = false)
    private int carbohydrates;
    @Column(nullable = false)
    private int fat;
}
