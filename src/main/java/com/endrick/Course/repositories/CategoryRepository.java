package com.endrick.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endrick.Course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
