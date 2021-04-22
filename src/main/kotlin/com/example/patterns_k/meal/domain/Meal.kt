package com.example.patterns_k.meal.domain

interface Meal {
    fun getCalories(): Int

    fun getQuantity(): Int

    fun getProductName(): String
}