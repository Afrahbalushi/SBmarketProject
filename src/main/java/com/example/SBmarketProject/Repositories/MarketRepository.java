package com.example.SBmarketProject.Repositories;

import com.example.SBmarketProject.Models.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface MarketRepository extends JpaRepository<Market,Integer> {
}
