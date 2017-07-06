package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Product;
import com.example.demo.dao.ShoppingCart;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.ShoppingCartRepository;

@Component
public class ShoppingCartService implements ShoppingCartServiceImp {
	
	private Map<Integer, ShoppingCart> shoppingCarts;

    @Autowired
    private UserService userService;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartService() {

        this.shoppingCarts = new HashMap<>();
    }

    @Override
    public void addProduct(Integer userId, Integer productid) {

        if (getAshoppingCart(userId) != null) {
            Product product = productRepository.findOne(productid);
            if (product != null) {
                getAshoppingCart(userId).getProducts().add(product);
            }

        }
    }

    @Override
    public void saveShoppingCart(Integer userId) {
        if (getAshoppingCart(userId) != null) {
            shoppingCartRepository.save(shoppingCarts.get(userId));
            shoppingCarts.remove(userId);
        }
    }

    @Override
    public ShoppingCart getAshoppingCart(Integer userId) {
        if (userService.isUserOn(userId)) {
            if (shoppingCarts.containsKey(userId)) {
                return shoppingCarts.get(userId);
            } else {
                shoppingCarts.put(userId, new ShoppingCart());
                return shoppingCarts.get(userId);
            }

        }

        return null;
}

}
