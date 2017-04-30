package KeyPointsFrom1To6;

import java.util.ArrayList;
import java.util.List;

public class Item implements SaleSubject{
	
	private int quantity;
	private String productName;
	private double unitPrice;
	private List<SaleObserver> observers;
	
	public Item(int quantity, String product, double unitPrice) {
		this.quantity = quantity;
		this.productName = product;
		this.unitPrice = unitPrice;	
		this.observers = new ArrayList<>();
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
		this.doNotify();
	}

	

	@Override
	public void addObserver(SaleObserver saleObserver) {
		this.observers.add(saleObserver);
		
	}

	@Override
	public void removeObserver(SaleObserver saleObserver) {
		this.observers.remove(saleObserver);
		
	}

	@Override
	public void doNotify() {
		for (SaleObserver saleObserver : this.observers) {
			saleObserver.doUpdate("The price has been changed.");
		}
		
	}
	
	
	

}
