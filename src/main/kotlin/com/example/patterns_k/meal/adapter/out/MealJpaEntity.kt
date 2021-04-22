package com.example.patterns_k.meal.adapter.out

import javax.persistence.*

@Entity
@Table(name = "meals")
class MealJpaEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,

    @Column(nullable = false, name = "productname")
    private var productName: String,

    @Column(nullable = false)
    private var calories: Int,

    @Column(nullable = false)
    private var quantity: Int
) {
    constructor() : this(null, "", 0, 0)

    fun getId(): Long = this.id ?: 0
}