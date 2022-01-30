package com.example.patterns_k.meal.adapter.out

import com.example.patterns_k.meal.domain.Meal
import org.springframework.stereotype.Component

@Component
internal class MealMapper {
    fun mapToMealEntity(meal: Meal) = MealMongoEntity(null, meal.getProductName(), meal.getCalories(), meal.getQuantity())
}