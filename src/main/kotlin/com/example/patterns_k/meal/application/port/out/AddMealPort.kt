package com.example.patterns_k.meal.application.port.out

import com.example.patterns_k.meal.adapter.out.MealId
import com.example.patterns_k.meal.domain.Meal

internal interface AddMealPort {
    fun addMeal(meal: Meal): MealId
}