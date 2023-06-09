package com.example.SBmarketProject.Repositories;

import com.example.SBmarketProject.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}