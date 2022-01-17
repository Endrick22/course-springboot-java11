package com.endrick.Course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.endrick.Course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
