package com.example.springboot_mongodb.service;

import com.example.springboot_mongodb.entity.Expense;

import java.util.List;

public interface ExpenseService {
    void addExpense(Expense expense);

    List<Expense> getAllExpenses();

    void updateExpense(String id, Expense expense);

    Expense getExpenseByName(String expenseName);

    void deleteExpense(String id);
}
