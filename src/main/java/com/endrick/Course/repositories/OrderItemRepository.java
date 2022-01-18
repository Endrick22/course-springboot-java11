package com.endrick.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endrick.Course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
