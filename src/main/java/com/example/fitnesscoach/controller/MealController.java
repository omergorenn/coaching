package com.example.fitnesscoach.controller;

import com.example.fitnesscoach.model.entity.Meal;
import com.example.fitnesscoach.service.MealService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/meals")
public class MealController {

    private MealService mealService;

    @PostMapping("")
    public ResponseEntity<Meal> createMeal(@RequestBody Meal meal) {
        // TODO: implementation of logic
        // TODO: create customized requests
        // TODO: create customized responses
        return new ResponseEntity<>(new Meal(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Meal> updateMeal(@PathVariable Long id, @RequestBody Meal meal) {
        // TODO: implementation of logic
        // TODO: create customized requests
        // TODO: create customized responses
        return new ResponseEntity<>(new Meal(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMeal(@PathVariable Long id) {
        // TODO: implementation of logic
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<Void> getAllMeals() {
        // TODO: implementation of logic
        // TODO: create customized responses
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Meal> getMealById(@PathVariable Long id) {
        // TODO: implementation of logic
        // TODO: create customized requests
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
