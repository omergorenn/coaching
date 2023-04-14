package com.example.fitnesscoach.repository;

import com.example.fitnesscoach.model.entity.Exercise;
import com.example.fitnesscoach.model.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise, String> {

    List<Exercise> findByExerciseId(String exerciseId);

}
