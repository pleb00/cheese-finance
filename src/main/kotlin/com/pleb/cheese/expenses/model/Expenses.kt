package com.pleb.cheese.expenses.model

import com.pleb.cheese.user.model.User
import jakarta.persistence.*

@Entity
@Table(name = "expenses", schema = "cheese")
data class Expenses(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User,

//    @Column(name = "user_id")
//    val userId: String,

    @Column(name = "name")
    val name: String,

    @Column(name = "recipient_id")
    val recipientId: Long,

    @Column(name = "description")
    val description: String,

    @Column(name = "amount")
    val amount: Long
)
