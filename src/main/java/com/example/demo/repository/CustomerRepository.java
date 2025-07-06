package com.example.demo.repository;

import com.example.demo.dto.CustomerTotalDto;
import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT c.name, SUM(o.amount)" +
            "FROM Customer c JOIN c.orders o GROUP BY c.c_id, c.name")
    List<CustomerTotalDto> findCustomerTotalPurchases();
}
