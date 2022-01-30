package com.example.patterns_k.meal.adapter.out

import org.springframework.data.mongodb.repository.MongoRepository

internal interface MealMongoRepository : MongoRepository<MealMongoEntity, String>