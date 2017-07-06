package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shoppingcart")
public class ShoppingCart {

	@Id
	@GeneratedValue
	@Column(name = "shoppingcartid")
	private int shoppingcartid;

	@Column(name = "description")
	private String description;

	@ManyToMany
	@JoinTable(name = "sale", joinColumns = @JoinColumn(name = "shoppingcartid", referencedColumnName = "shoppingcartid"), inverseJoinColumns = @JoinColumn(name = "productid", referencedColumnName = "productid"))
	private List<Product> products = new ArrayList<>();
	
	@ManyToOne
    @JoinColumn(name = "userid")
	private User user;

	public int getShoppingcartid() {
		return shoppingcartid;
	}

	public void setShoppingcartid(int shoppingcartid) {
		this.shoppingcartid = shoppingcartid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
