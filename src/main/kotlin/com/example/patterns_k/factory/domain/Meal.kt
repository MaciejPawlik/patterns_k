package com.example.patterns_k.factory.domain

interface Meal {
    fun getCalories(): Int

    fun getQuantity(): Int

    fun getProductName(): String
}