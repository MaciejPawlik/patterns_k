package com.example.patterns_k.factory.domain

data class Drink(val product: Product, val volume: Int) : Meal {
    override fun getCalories(): Int = product.calories * volume
}
