package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dao.User;

@Service
public interface UserServiceImp {
	
	public void addUser(User user);

	public User login(String name, String password);

	public boolean isUserOn(Integer userId);

}
