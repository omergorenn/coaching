package com.example.fitnesscoach.service;

import com.example.fitnesscoach.model.Meal;
import com.example.fitnesscoach.repository.MealRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MealService {

    private final MealRepository mealRepository;

    @Autowired
    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public Meal createMeal(Meal meal) {
        return mealRepository.save(meal);
    }

    public Meal updateMeal(Long id, Meal meal) {
        Optional<Meal> optionalMeal = mealRepository.findById(id);
        if (optionalMeal.isPresent()) {
            Meal existingMeal = optionalMeal.get();
            existingMeal.setName(meal.getName());
            existingMeal.setDescription(meal.getDescription());
            existingMeal.setCalories(meal.getCalories());
            existingMeal.setProtein(meal.getProtein());
            existingMeal.setCarbohydrates(meal.getCarbohydrates());
            existingMeal.setFat(meal.getFat());
            return mealRepository.save(existingMeal);
        } else {
            throw new EntityNotFoundException("Meal not found with id " + id);
        }
    }

    public void deleteMeal(Long id) {
        Optional<Meal> optionalMeal = mealRepository.findById(id);
        if (optionalMeal.isPresent()) {
            mealRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Meal not found with id " + id);
        }
    }

    public Meal getMealById(Long id) {
        Optional<Meal> optionalMeal = mealRepository.findById(id);
        if (optionalMeal.isPresent()) {
            return optionalMeal.get();
        } else {
            throw new EntityNotFoundException("Meal not found with id " + id);
        }
    }

    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }
}
