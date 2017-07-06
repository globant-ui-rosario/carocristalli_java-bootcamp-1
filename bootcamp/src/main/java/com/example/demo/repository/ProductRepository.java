package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dao.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	public Product findByProductnameOrCategory(String productname, String category);

}
