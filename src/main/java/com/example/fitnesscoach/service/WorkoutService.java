package com.example.fitnesscoach.service;

import com.example.fitnesscoach.model.Workout;
import com.example.fitnesscoach.repository.WorkoutRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WorkoutService {

    private final WorkoutRepository workoutRepository;

    public Workout createWorkout(Workout workout) {
        // TODO: implementation of logic
        return workoutRepository.save(workout);
    }

    public Workout updateWorkout(Long id, Workout workout) {
        // TODO: implementation of logic
       return workoutRepository.save(workout);
    }

    public void deleteWorkout(Long id) {
        // TODO: implementation of logic
    }

    public Workout getWorkoutById(Long id) {
        // TODO: implementation of logic
        // TODO: handle optional
        return workoutRepository.findById(id).get();
    }

    public List<Workout> getAllWorkouts() {
        // TODO: implementation of logic
        return workoutRepository.findAll();
    }
}
