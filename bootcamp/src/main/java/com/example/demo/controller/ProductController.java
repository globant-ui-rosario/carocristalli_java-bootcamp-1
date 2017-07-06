package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Product;
import com.example.demo.repository.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(method=RequestMethod.GET, value="/products")
	public Product productByNameOrCategory(@RequestParam(value="productname" , required = true) String productname,
											@RequestParam(value="category" , required = true) String category) {

		return productRepository.findByProductnameOrCategory(productname, category);

	}

}
