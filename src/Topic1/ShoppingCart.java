package Topic1;

import java.util.List;
import java.util.Observer;

public class ShoppingCart {
	
	private List<Item> items;
	private User user;
	private Payment payment;
	private List<Observer> observers;
	
	public ShoppingCart() {

		
}
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public List<Observer> getObservers() {
		return observers;
	}
	
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	
	@SuppressWarnings("rawtypes")
	public double getAmount() {
		
	    double amount = 0;  
	    for (Item item : items) {
			amount += item.getUnitPrice()*item.getQuantity();
		}
	    return amount;
	           		
	}

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + ", user=" + user + ", payment=" + payment + ", observers=" + observers
				+ "]";
	}
	
	
	
	public Item getCheapestItem() {

		Item cheapestItem = items.get(0);
		for (Item item : items) {
			if (item.getUnitPrice()*item.getQuantity() < cheapestItem.getUnitPrice()*item.getQuantity()) {
				cheapestItem = item;
			}
		}
		return cheapestItem;

	}

	public Item getExpensiveItem() {
		Item expensiveItem = items.get(0);
		for (Item item : items) {
			if (item.getUnitPrice()*item.getQuantity() > expensiveItem.getUnitPrice()*item.getQuantity()) {
				expensiveItem = item;
			}
		}
		return expensiveItem;

	}


}
