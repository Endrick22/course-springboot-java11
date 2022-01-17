package com.endrick.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endrick.Course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
