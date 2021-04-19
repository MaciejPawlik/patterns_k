package com.example.patterns_k.factory.model

data class Snack(val product: Product, val weight: Int) : Meal {
    override fun getCalories(): Int = product.calories * weight
}