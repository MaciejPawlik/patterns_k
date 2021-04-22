package com.example.patterns_k.meal.domain

data class Drink(val product: Product, val volume: Int) : Meal {
    override fun getCalories(): Int = product.calories * volume

    override fun getQuantity(): Int = volume

    override fun getProductName(): String = product.name
}
