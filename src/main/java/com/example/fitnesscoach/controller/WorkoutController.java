package com.example.fitnesscoach.controller;

import com.example.fitnesscoach.model.Workout;
import com.example.fitnesscoach.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @GetMapping("")
    public List<Workout> getAllWorkouts() {
        return workoutService.getAllWorkouts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Workout> getWorkoutById(@PathVariable("id") Long id) {
        Workout workout = workoutService.getWorkoutById(id);
        if (workout == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(workout);
    }

    @PostMapping("")
    public ResponseEntity<Workout> createWorkout(@RequestBody Workout workout) {
        Workout newWorkout = workoutService.createWorkout(workout);
        return ResponseEntity.status(HttpStatus.CREATED).body(newWorkout);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Workout> updateWorkout(@PathVariable("id") Long id, @RequestBody Workout workout) {
        Workout updatedWorkout = workoutService.updateWorkout(id, workout);
        if (updatedWorkout == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedWorkout);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Workout> deleteWorkout(@PathVariable("id") Long id) {
        Workout deletedWorkout = workoutService.deleteWorkout(id);
        if (deletedWorkout == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(deletedWorkout);
    }
}
