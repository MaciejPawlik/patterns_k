package com.example.patterns_k.meal.adapter.out

import org.springframework.data.jpa.repository.JpaRepository

interface MealJpaRepository : JpaRepository<MealJpaEntity, Long> {
}