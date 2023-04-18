package com.example.SBmarketProject.Services;

import com.example.SBmarketProject.Models.Item;
import com.example.SBmarketProject.Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
    public Item getItemById(Integer id) {
        return itemRepository.findById(id).get();
    }
}
