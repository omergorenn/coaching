package com.example.fitnesscoach.controller;

import com.example.fitnesscoach.model.entity.Exercise;
import com.example.fitnesscoach.service.ExerciseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/exercises")
public class ExerciseController {

    private ExerciseService exerciseService;

    @PostMapping("")
    public ResponseEntity<Exercise> createExercise(@RequestBody Exercise exercise) {
        Exercise createdExercise = exerciseService.createExercise(exercise);
        return ResponseEntity.ok(createdExercise);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exercise> updateUser(@PathVariable Long id, @RequestBody Exercise user) {
        Exercise updatedExercise = exerciseService.updateExercise(id, user);
        return ResponseEntity.ok(updatedExercise);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        exerciseService.deleteExercise(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("")
    public ResponseEntity<List<Exercise>> getAllUsers() {
        List<Exercise> users = exerciseService.getAllExercises();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercise> getExerciseById(@PathVariable Long id) {
        Exercise exercise = exerciseService.getExerciseById(id);
        return ResponseEntity.ok(exercise);
    }
}
