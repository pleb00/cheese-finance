package com.pleb.cheese.expenses.repository

import com.pleb.cheese.expenses.model.Expenses
import org.springframework.data.jpa.repository.JpaRepository

interface ExpensesRepository : JpaRepository<Expenses, Long> {
}