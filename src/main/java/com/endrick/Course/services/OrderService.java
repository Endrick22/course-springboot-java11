package com.endrick.Course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endrick.Course.entities.Order;
import com.endrick.Course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order finById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
