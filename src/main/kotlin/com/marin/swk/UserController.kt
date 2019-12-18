package com.marin.swk

import lombok.AllArgsConstructor
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@AllArgsConstructor
@RestController
@RequestMapping("/user")
class UserController(val environment: Environment) {

    @GetMapping("/status")
    fun getStatus(): String{
        return "Service is working on a port ${environment.getProperty("local.server.port")}"
    }

}