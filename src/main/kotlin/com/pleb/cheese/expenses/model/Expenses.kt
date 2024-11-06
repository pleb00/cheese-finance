package com.pleb.cheese.expenses.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "expenses", schema = "cheese")
data class Expenses(
    @Id
    @Column(name = "id")
    val id: Long,

    @Column(name = "user_id")
    val userId: String,

    @Column(name = "name")
    val name: String,

    @Column(name = "recipient_id")
    val recipientId: Long,

    @Column(name = "description")
    val description: String,

    @Column(name = "amount")
    val amount: Long
)
