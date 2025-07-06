package com.example.demo.dto;

public class CustomerTotalDto {
    private String name;
    private Long totalAmount;

    public CustomerTotalDto(String name, Long totalAmount) {
        this.name = name;
        this.totalAmount = totalAmount;
    }

    // getters
    public String getName() { return name; }
    public Long getTotalAmount() { return totalAmount; }
}
