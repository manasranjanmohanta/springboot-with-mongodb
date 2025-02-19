package com.example.springboot_mongodb.repository.impl;

import com.example.springboot_mongodb.entity.Expense;
import com.example.springboot_mongodb.repository.ExpenseRepository;
import com.example.springboot_mongodb.service.ExpenseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseServiceImpl implements ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public void addExpense(Expense expense) {
        expenseRepository.insert(expense);
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    @Override
    public void updateExpense(String id, Expense expense) {
        Expense existingExpense = expenseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot find Expense by ID %s", id)
                ));

        existingExpense.setExpenseName(expense.getExpenseName());
        existingExpense.setExpenseCategory(expense.getExpenseCategory());
        existingExpense.setExpenseAmount(expense.getExpenseAmount());

        expenseRepository.save(existingExpense);
    }

    @Override
    public Expense getExpenseByName(String expenseName) {
    return expenseRepository.findByExpenseName(expenseName)
            .orElseThrow(() -> new RuntimeException(
                    String.format("Cannot find Expense by NAME %s", expenseName)
            ));
    }

    @Override
    public void deleteExpense(String id) {
        expenseRepository.deleteById(id);
    }
}
