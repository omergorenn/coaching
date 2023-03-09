package com.example.fitnesscoach.controller;

import com.example.fitnesscoach.model.Workout;
import com.example.fitnesscoach.service.WorkoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/workout/")
public class WorkoutController {

    private WorkoutService workoutService;

    @PostMapping("")
    public ResponseEntity<Workout> createWorkout(@RequestBody Workout workout) {
        // TODO: implementation of logic
        // TODO: create customized requests
        // TODO: create customized responses
        return new ResponseEntity<>(new Workout(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Workout> updateWorkout(@PathVariable("id") Long id, @RequestBody Workout workout) {
        // TODO: implementation of logic
        // TODO: create customized requests
        // TODO: create customized responses
        return new ResponseEntity<>(new Workout(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkout(@PathVariable("id") Long id) {
        // TODO: implementation of logic
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("")
    public List<Workout> getAllWorkouts() {
        return workoutService.getAllWorkouts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Workout> getWorkoutById(@PathVariable("id") Long id) {
        // TODO: implementation of logic
        return new ResponseEntity<>(new Workout(), HttpStatus.OK);
    }
}
