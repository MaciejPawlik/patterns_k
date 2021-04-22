package com.example.patterns_k.meal.application.port.out

import com.example.patterns_k.meal.domain.Meal

interface AddMealPort {
    fun addMeal(meal: Meal): Long
}