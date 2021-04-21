package com.example.patterns_k.factory.adapter.`in`

import com.example.patterns_k.factory.port.`in`.AddMealUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
@RestController
internal class AddMealEndpoint(val addMealUseCase: AddMealUseCase) {

    @PostMapping("/meals")
    internal fun addMeal(@RequestBody input: MealDto) = addMealUseCase.addMealCommand(
        AddMealUseCase.AddMealCommand(
        input.type,
        input.productName,
        input.quantity
    ))
}