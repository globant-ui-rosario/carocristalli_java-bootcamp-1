package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.User;
import com.example.demo.repository.UserRepository;

@Component
public class UserService implements UserServiceImp {
	 @Autowired
	    private UserRepository userRepository;

	    private List<User> usersLoggedOn = new ArrayList<>();

	    @Override
	    public void addUser(User user) {
	        User existingUser = userRepository.findByNameAndPassword(user.getName(), user.getPassword());
	        if (existingUser == null) {
	            userRepository.save(user);
	        }
	    }

	    @Override
	    public User login(String name, String password) {
	        User user = null;
	        user = userRepository.findByNameAndPassword(name, password);
	        if (user == null) {
	            user = new User();
	            user.setName("not registered user");
	            user.setPassword("not registered user");
	        } else {
	            if (!isUserOn(user.getUserid())) {
	                usersLoggedOn.add(user);
	            }
	        }

	        return user;
	    }

	    @Override
	    public boolean isUserOn(Integer userId) {
	        boolean isOn = false;
	        for (User user : usersLoggedOn) {
	            if (user.getUserid() == userId) {
	                isOn = true;
	            }
	        }

	        return isOn;
	}

}
