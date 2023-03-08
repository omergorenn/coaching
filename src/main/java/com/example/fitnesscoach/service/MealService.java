package com.example.fitnesscoach.service;

import com.example.fitnesscoach.model.Meal;
import com.example.fitnesscoach.repository.MealRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MealService {

    private final MealRepository mealRepository;

    public Meal createMeal(Meal meal) {
        // TODO: implement validation logic
        // TODO: get entity from request (need to create domain with record) not from entity
        return mealRepository.save(meal);
    }

    public Meal updateMeal(Long id, Meal meal) {

        // TODO: get entity from request (need to create domain models with record) not from entity


        var existingMeal = mealRepository.findById(id).orElseThrow(EntityNotFoundException::new);

        existingMeal.setName(meal.getName());
        existingMeal.setDescription(meal.getDescription());
        existingMeal.setMealItems(meal.getMealItems());
        existingMeal.setUser(meal.getUser());
        existingMeal.setDate(meal.getDate());

        return mealRepository.save(existingMeal);
    }

    public void deleteMeal(Long id) {

        var mealToDelete = mealRepository.findById(id).orElseThrow(EntityNotFoundException::new);

        mealRepository.deleteById(mealToDelete.getId());

    }

    public Meal getMealById(Long id) {
       return mealRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<Meal> getAllMeals() {
        // TODO: shouldn't return List<T> directly create response type which contains List<Meal> below example

        /*
        * public record AllMealResponse(List<Meal>){ }
        *
        * */
        return mealRepository.findAll();
    }
}
