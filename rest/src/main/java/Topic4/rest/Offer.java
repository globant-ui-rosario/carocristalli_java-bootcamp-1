package Topic4.rest;

import java.util.ArrayList;
import java.util.List;

public class Offer implements SaleSubject {
	
	private String offerName;
	private List<Item> items;
	private double percentage;
	private List<SaleObserver> observers;
	
	public Offer() {
		this.observers = new ArrayList<>();
	}

	
	public List<SaleObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<SaleObserver> observers) {
		this.observers = observers;
	}

	public Offer(String name, double percentage) {
		this.offerName = name;
		this.percentage = percentage;
		this.observers = new ArrayList<>();
}
	
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	public void showOffer() {
		double total = 0;
		for (Item item : items) {
			 total = item.getUnitPrice()*item.getQuantity() + total; 
		}
		double totalWithDiscount = total - total*this.percentage;
		System.out.println("Offer" + this.offerName+" $" + total + " - With discount: $" + totalWithDiscount);
		this.showItems();
		
	}
	public void showItems() {

		for (Item item : this.items){
			System.out.println("Product: "+item.getProductName() + " - Unit Price: " + item.getUnitPrice() + " - Total: " + item.getUnitPrice()*item.getQuantity());  
		}

		}

	


	@Override
	public void addObserver(SaleObserver saleObserver) {
		this.observers.add(saleObserver);
		this.doNotify();
		
		
	}


	@Override
	public void removeObserver(SaleObserver saleObserver) {
		this.observers.remove(saleObserver);
		
	}


	@Override
	public void doNotify() {
		for (SaleObserver saleObserver : this.observers) {
			saleObserver.doUpdate("New Offer");
		}
		
	}

}
