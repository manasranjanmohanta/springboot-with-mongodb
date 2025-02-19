package com.example.springboot_mongodb.repository;

import com.example.springboot_mongodb.entity.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
    @Query(
            value = "SELECT e FROM Expense e WHERE e.expenseName = :expenseName"
    )
//    @Query("{'name': ?0")
    Optional<Expense> findByExpenseName(@Param("expenseName") String expenseName);
}
