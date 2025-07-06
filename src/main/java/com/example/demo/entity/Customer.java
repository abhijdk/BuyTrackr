package com.example.demo.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    private Long c_id;

    private String name;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    // getters and setters
    public Long getC_id() { return c_id; }
    public void setC_id(Long c_id) { this.c_id = c_id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public List<Order> getOrders() { return orders; }
    public void setOrders(List<Order> orders) { this.orders = orders; }
}
