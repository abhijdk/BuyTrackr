package com.example.demo.controller;

import com.example.demo.dto.CustomerTotalDto;
import com.example.demo.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/totals")
    public List<CustomerTotalDto> getCustomerTotals() {
        return customerRepository.findCustomerTotalPurchases();
    }
}
