package com.example.SBmarketProject.Controller;

import com.example.SBmarketProject.Models.Item;
import com.example.SBmarketProject.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "item")
public class ItemController {
    @Autowired
    ItemService itemService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Item> findItems() {
        return itemService.getAllItems();
    }

}
