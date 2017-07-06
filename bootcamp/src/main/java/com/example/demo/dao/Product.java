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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue
	@Column(name = "productid")
	private int productid;

	@Column(name = "productname")
	private String productname;

	@Column(name = "category")
	private String category;

	@ManyToMany
	@JsonBackReference
	@JoinTable(name = "sale", joinColumns = @JoinColumn(name = "productid", referencedColumnName = "productid"), inverseJoinColumns = @JoinColumn(name = "shoppingcartid", referencedColumnName = "shoppingcartid"))
	private List<ShoppingCart> shoppingcarts = new ArrayList<>();

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public List<ShoppingCart> getShoppingcarts() {
		return shoppingcarts;
	}

	public void setShoppingcarts(List<ShoppingCart> shoppingcarts) {
		this.shoppingcarts = shoppingcarts;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
