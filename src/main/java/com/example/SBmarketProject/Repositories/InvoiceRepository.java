package com.example.SBmarketProject.Repositories;

import com.example.SBmarketProject.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}