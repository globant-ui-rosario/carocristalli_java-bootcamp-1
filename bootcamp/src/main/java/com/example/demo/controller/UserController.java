package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public void addUser(@RequestBody User user) {

		userService.addUser(user);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/user/{name}/{password}")
	public User userLogin(@RequestParam(value="name" , required = true) String name,
			@RequestParam(value="password" , required = true) String password) {

		return userService.login(name, password);


	}

}
