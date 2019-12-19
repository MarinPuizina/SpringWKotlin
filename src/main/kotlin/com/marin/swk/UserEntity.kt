package com.marin.swk

import javax.persistence.*

@Entity
@Table(name = "Users")
data class UserEntity(@Id
                      @GeneratedValue(strategy = GenerationType.AUTO)
                      val id: Long = 0,
                      val name: String = "EMPTY",
                      val email: String = "EMPTY")