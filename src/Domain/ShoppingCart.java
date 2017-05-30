package Domain;

import java.util.List;

public class ShoppingCart {
	
	private List<Item> items;
	private User user;
	private Payment payment;
	
	
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
		return "ShoppingCart [items=" + items + ", user=" + user + ", payment=" + payment 
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
	
	public void pay(PaymentTransaction transaction) {

		this.payment.pay(this, transaction.newTransaction());

		}

	public void showItems() {

		for (Item item : this.items){
			System.out.println("Product: "+item.getProductName() + " - Unit Price: " + item.getUnitPrice() + " - Total: " + item.getUnitPrice()*item.getQuantity());  
		}

		}

	

}
