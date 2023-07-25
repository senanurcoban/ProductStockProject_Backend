package com.example.demo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
