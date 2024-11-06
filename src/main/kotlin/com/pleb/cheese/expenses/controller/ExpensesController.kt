package com.pleb.cheese.expenses.controller

import com.pleb.cheese.expenses.model.Expenses
import com.pleb.cheese.expenses.service.ExpensesService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/exp")
class ExpensesController(
    val expensesService: ExpensesService
) {
    @GetMapping
    fun getAllExpenses(): List<Expenses>{
        return expensesService.getExpenses()
    }
}