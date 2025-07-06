package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private Long o_id;

    private String item;

    private Integer amount;

    @ManyToOne
    @JoinColumn(name = "c_id")
    private Customer customer;

    // getters and setters
    public Long getO_id() { return o_id; }
    public void setO_id(Long o_id) { this.o_id = o_id; }
    public String getItem() { return item; }
    public void setItem(String item) { this.item = item; }
    public Integer getAmount() { return amount; }
    public void setAmount(Integer amount) { this.amount = amount; }
    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
}
