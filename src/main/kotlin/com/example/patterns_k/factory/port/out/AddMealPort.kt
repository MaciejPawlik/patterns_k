package com.example.patterns_k.factory.port.out

import com.example.patterns_k.factory.domain.Meal

interface AddMealPort {
    fun addMeal(meal: Meal): Long
}