package com.endrick.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endrick.Course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
