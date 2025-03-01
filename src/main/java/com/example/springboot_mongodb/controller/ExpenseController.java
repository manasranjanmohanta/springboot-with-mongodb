package com.example.springboot_mongodb.controller;

import com.example.springboot_mongodb.entity.Expense;
import com.example.springboot_mongodb.service.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ResponseEntity addExpense(@RequestBody Expense expense) {
        expenseService.addExpense(expense);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Expense>> getAllExpenses() {
        return ResponseEntity.ok(expenseService.getAllExpenses());
    }

    @PutMapping("/{id}")
    public ResponseEntity updateExpense(@PathVariable String id, @RequestBody Expense expense) {
        expenseService.updateExpense(id, expense);
        return ResponseEntity.ok().build();
    }

    @GetMapping("expense-name/{expenseName}")
    public ResponseEntity<Expense> getExpenseByName(@PathVariable String expenseName) {
        return ResponseEntity.ok(expenseService.getExpenseByName(expenseName));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteExpense(@PathVariable String id) {
        expenseService.deleteExpense(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
