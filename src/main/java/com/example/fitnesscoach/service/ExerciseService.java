package com.example.fitnesscoach.service;

import com.example.fitnesscoach.model.entity.Exercise;
import com.example.fitnesscoach.model.entity.User;
import com.example.fitnesscoach.repository.ExerciseRepository;
import com.opencsv.CSVReader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public Exercise updateExercise(Long id, Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public void deleteExercise(Long id) {

    }

    public Exercise getExerciseById(Long id) {
        // TODO: implementation of logic
        // TODO: Handle optional
        return exerciseRepository.findById(String.valueOf((id))).get();
    }

    public List<Exercise> getAllExercises() {
        // TODO: implementation of logic
        return exerciseRepository.findAll();
    }

    public static void main(String[] args) throws IOException {
        List<Exercise> exercises = new ArrayList<>();
        CSVReader reader = new CSVReader(new FileReader("fitness_exercises.csv"));
        String[] line;
        while ((line = reader.readNext()) != null) {
            Exercise exercise = new Exercise();
            String[] values = line[0].split(",");
            exercise.setBodyPart(values[0]);
            exercise.setEquipment(values[1]);
            exercise.setGifUrl(values[2]);
            exercise.setId(values[3]);
            exercise.setName(values[4]);
            exercise.setTarget(values[5]);
            exercises.add(exercise);
        }
    }


}
