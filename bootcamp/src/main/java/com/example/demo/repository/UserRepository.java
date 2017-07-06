package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dao.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByNameAndPassword(String name, String password);
}
