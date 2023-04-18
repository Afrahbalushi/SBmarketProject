package com.example.SBmarketProject.Services;

import com.example.SBmarketProject.Models.Market;
import com.example.SBmarketProject.Repositories.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService {
    @Autowired
    MarketRepository marketRepository;
    public List<Market> getAllMarket() {
        return marketRepository.findAll();
    }
    public Market getMarketById(Integer id) {
        return marketRepository.findById(id).get();
    }
}
