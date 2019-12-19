package com.marin.swk

import lombok.AllArgsConstructor
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.*

@AllArgsConstructor
@RestController
@RequestMapping("/users")
class UserController(val environment: Environment, val userRepository: UserRepository) {

    @GetMapping("/status")
    fun getStatus(): String{
        return "Service is working on a port ${environment.getProperty("local.server.port")}"
    }

    /*
    @GetMapping
    fun getUser(): User {
        return User("Marin", 12312312, "bla@bla.com")
    }*/

    @GetMapping
    fun getUsers(): List<UserEntity> {
        return userRepository.findAll()
    }

    @PostMapping
    fun createUser(@RequestBody user: UserEntity): UserEntity {
        return userRepository.save(UserEntity(user.id, user.name, user.email))
    }

}