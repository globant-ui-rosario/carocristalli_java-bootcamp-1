package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dao.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Integer> {

}
