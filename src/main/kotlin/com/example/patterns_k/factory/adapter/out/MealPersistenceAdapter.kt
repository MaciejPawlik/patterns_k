package com.example.patterns_k.factory.adapter.out

import com.example.patterns_k.factory.domain.Meal
import com.example.patterns_k.factory.port.out.AddMealPort
import org.springframework.stereotype.Component

@Component
class MealPersistenceAdapter(val repository: MealJpaRepository, val mealMapper: MealMapper) : AddMealPort {
    override fun addMeal(meal: Meal): Long = repository.save(mealMapper.mapToMealEntity(meal)).getId()
}