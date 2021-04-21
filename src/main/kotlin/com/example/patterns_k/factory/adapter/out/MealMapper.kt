package com.example.patterns_k.factory.adapter.out

import com.example.patterns_k.factory.domain.Meal
import org.springframework.stereotype.Component

@Component
class MealMapper {
    fun mapToMealEntity(meal: Meal) = MealEntity(null, meal.getProductName(), meal.getCalories(), meal.getQuantity())
}