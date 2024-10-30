package com.example.demo.Dao.repository;

import com.example.demo.Dao.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
