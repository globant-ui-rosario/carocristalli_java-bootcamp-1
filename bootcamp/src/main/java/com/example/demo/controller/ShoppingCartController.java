package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ShoppingCart;
import com.example.demo.service.ShoppingCartService;

@RestController
public class ShoppingCartController {
	
	@Autowired
    private ShoppingCartService shoppingCartService;

    @RequestMapping(method = RequestMethod.GET, value = "/shoppingCart")
    public ShoppingCart getAshoppingCart(@RequestParam(value="userId" , required = true) int userId) {

        return shoppingCartService.getAshoppingCart(userId);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/shoppingCart/addProduct")
    public void addProduct(@RequestParam(value="userId" , required = true) int userId,
    						@RequestParam(value="productId" , required = true) int productId) {

        shoppingCartService.addProduct(userId, productId);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/shoppingCart/save")
    public void addProduct(@RequestParam(value="userId" , required = true) int userId) {

        shoppingCartService.saveShoppingCart(userId);

}

}
