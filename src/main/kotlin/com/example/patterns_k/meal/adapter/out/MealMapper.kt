package com.example.patterns_k.meal.adapter.out

import com.example.patterns_k.meal.domain.Meal
import org.springframework.stereotype.Component

@Component
class MealMapper {
    fun mapToMealEntity(meal: Meal) = MealJpaEntity(null, meal.getProductName(), meal.getCalories(), meal.getQuantity())
}