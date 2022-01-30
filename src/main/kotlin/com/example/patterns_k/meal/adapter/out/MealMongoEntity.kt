package com.example.patterns_k.meal.adapter.out

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("meals")
internal data class MealMongoEntity(
    @Id
    @Field(name = "id")
    private var mealId: String? = null,

    @Field(name = "productname")
    private val productName: String,

    private val calories: Int,

    private val quantity: Int,
) : MealId {
    override fun getId(): String = mealId.toString()
}