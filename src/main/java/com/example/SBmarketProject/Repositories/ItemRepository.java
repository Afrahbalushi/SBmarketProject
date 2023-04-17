package com.example.SBmarketProject.Repositories;

import com.example.SBmarketProject.Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

@Controller
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
