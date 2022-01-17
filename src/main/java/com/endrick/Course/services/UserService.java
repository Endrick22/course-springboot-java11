package com.endrick.Course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.endrick.Course.entities.User;
import com.endrick.Course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User finById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
