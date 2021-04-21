package com.example.patterns_k.factory.adapter.out

import org.springframework.data.jpa.repository.JpaRepository

interface MealJpaRepository : JpaRepository<MealEntity, Long> {
}