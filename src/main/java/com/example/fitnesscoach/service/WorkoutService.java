package com.example.fitnesscoach.service;

import com.example.fitnesscoach.model.Workout;
import com.example.fitnesscoach.repository.WorkoutRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutService {

    private final WorkoutRepository workoutRepository;

    @Autowired
    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public Workout createWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public Workout updateWorkout(Long id, Workout workout) {
        Optional<Workout> optionalWorkout = workoutRepository.findById(id);
        if (optionalWorkout.isPresent()) {
            Workout existingWorkout = optionalWorkout.get();
            existingWorkout.setName(workout.getName());
            existingWorkout.setDescription(workout.getDescription());
            existingWorkout.setDuration(workout.getDuration());
            existingWorkout.setDifficulty(workout.getDifficulty());
            existingWorkout.setExercises(workout.getExercises());
            return workoutRepository.save(existingWorkout);
        } else {
            throw new EntityNotFoundException("Workout not found with id " + id);
        }
    }

    public void deleteWorkout(Long id) {
        Optional<Workout> optionalWorkout = workoutRepository.findById(id);
        if (optionalWorkout.isPresent()) {
            workoutRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Workout not found with id " + id);
        }
    }

    public Workout getWorkoutById(Long id) {
        Optional<Workout> optionalWorkout = workoutRepository.findById(id);
        if (optionalWorkout.isPresent()) {
            return optionalWorkout.get();
        } else {
            throw new EntityNotFoundException("Workout not found with id " + id);
        }
    }

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }
}
