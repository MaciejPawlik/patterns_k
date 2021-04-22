package com.example.patterns_k.meal.adapter.out

import com.example.patterns_k.meal.domain.Meal
import com.example.patterns_k.meal.application.port.out.AddMealPort
import org.springframework.stereotype.Component

@Component
internal class MealPersistenceAdapter(val repository: MealJpaRepository, val mealMapper: MealMapper) : AddMealPort {
    override fun addMeal(meal: Meal): Long = repository.save(mealMapper.mapToMealEntity(meal)).getId()
}