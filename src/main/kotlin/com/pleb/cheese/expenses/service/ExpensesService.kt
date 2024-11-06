package com.pleb.cheese.expenses.service

import com.pleb.cheese.expenses.model.Expenses

interface ExpensesService {
    fun getExpenses(): List<Expenses>
}