package com.example.patterns_k.meal.adapter.out

import org.springframework.data.jpa.repository.JpaRepository

internal interface MealJpaRepository : JpaRepository<MealJpaEntity, Long> {
}