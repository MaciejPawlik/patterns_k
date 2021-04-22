package com.example.patterns_k.meal.domain

data class Snack(val product: Product, val weight: Int) : Meal {
    override fun getCalories(): Int = product.calories * weight

    override fun getQuantity(): Int = weight

    override fun getProductName(): String = product.name
}