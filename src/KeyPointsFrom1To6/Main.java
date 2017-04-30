package KeyPointsFrom1To6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		User user = new User("Carolina ", "bootcamp1", "carocristalli@mail.com", "1689 1689 1689 1689");
		ShoppingCart shoppingCart = new ShoppingCart();
						
		shoppingCart.setUser(user);
		List<Item> items = new ArrayList<>();
		items.add(new Item(1,"Apothecary Table",100.5));
		items.add(new Item(1,"Ornamental Bird Cage",50));
		items.add(new Item(2,"Ichiban Lipstick For Men",10));
		
		shoppingCart.setItems(items);
		
		shoppingCart.setPayment(new CreditCard());

		System.out.println("total amount =" + shoppingCart.getAmount());
		
		PaymentTransaction transaction = new PaymentTransaction();
		MailObserver mailObserver = new MailObserver();
		
		transaction.addObserver(mailObserver);
		
		shoppingCart.setPayment(new CreditCard());
		shoppingCart.pay(transaction);

		shoppingCart.setPayment(new Paypal());
		shoppingCart.pay(transaction);

		shoppingCart.setPayment(new Cash());
		shoppingCart.pay(transaction);
		
		shoppingCart.showItems();
		
		List<Item> itemsOffer = new ArrayList<>();
		itemsOffer.add(new Item(3,"Cup",10));
		itemsOffer.add(new Item(3,"Dish",11.5));
		Offer offer = new Offer("For the kitchen", 0.5);
		offer.setItems(itemsOffer);
		offer.showOffer();
		
		offer.addObserver(mailObserver);
		itemsOffer.get(0).addObserver(mailObserver);
		itemsOffer.get(0).setUnitPrice(9);
		
	}

}
