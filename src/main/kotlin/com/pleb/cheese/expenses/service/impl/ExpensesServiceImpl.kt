package com.pleb.cheese.expenses.service.impl

import com.pleb.cheese.expenses.model.Expenses
import com.pleb.cheese.expenses.repository.ExpensesRepository
import com.pleb.cheese.expenses.service.ExpensesService
import org.springframework.stereotype.Service

@Service
class ExpensesServiceImpl(
    val expensesRepository: ExpensesRepository
): ExpensesService {
    override fun getExpenses(): List<Expenses> {
        return expensesRepository.findAll()
    }
}