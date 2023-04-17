package com.example.SBmarketProject.Controller;

import com.example.SBmarketProject.Models.Customer;
import com.example.SBmarketProject.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customer> findCustomers() {
        return customerService.getAllCustomers();
    }
}

