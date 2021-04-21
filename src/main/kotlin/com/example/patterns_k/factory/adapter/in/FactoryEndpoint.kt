package com.example.patterns_k.factory.adapter.`in`

import com.example.patterns_k.factory.usecase.AddMealUseCase
import com.example.patterns_k.factory.port.`in`.MealFactory
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
@RestController
internal class FactoryEndpoint(val factory: MealFactory) {

    @PostMapping("/factories")
    internal fun addProduct(@RequestBody input: MealDto) = factory.addMealCommand(AddMealUseCase.AddMealCommand(
        input.type,
        input.productName,
        input.quantity
    ))
}