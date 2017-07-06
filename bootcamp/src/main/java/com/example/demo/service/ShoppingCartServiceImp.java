package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dao.ShoppingCart;

@Service
public interface ShoppingCartServiceImp {
	
	public ShoppingCart getAshoppingCart(Integer userid);

	public void addProduct(Integer userid,Integer productid);

public void saveShoppingCart(Integer userId);

}
