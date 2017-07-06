package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mock;

import com.example.demo.dao.Product;
import com.example.demo.repository.ProductRepository;

public class ProductServiceTest {
	
	 @Mock
	    private ProductRepository productRepository;


	    @Test
	    public void shouldReturnProduct() {

	        Product product = new Product();
	        product.setProductid(1);
	        product.setProductname("Jeans"); 
	        product.setCategory("Clothes");

	        when(productRepository.findByProductnameOrCategory("Jeans", "Clothes")).thenReturn(product);

	        assertEquals(productRepository.findByProductnameOrCategory("Jeans", "Clothes"), product);

	}

}
