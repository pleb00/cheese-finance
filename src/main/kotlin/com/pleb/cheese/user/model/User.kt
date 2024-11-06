package com.pleb.cheese.user.model

import jakarta.persistence.*

@Entity
@Table(name = "users", schema = "cheese")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "username")
    val username: String,

    @Column(name = "password")
    val password: String,

    @Column(name = "name")
    val name: String,

    @Column(name = "current_target")
    val currentTarget: Long,

    @Column(name = "current_expenses")
    val currentExpenses: Long

)
