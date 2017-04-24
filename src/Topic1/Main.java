package Topic1;

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
		
		shoppingCart.setPayment(new Cash());

		System.out.println("total amount =" + shoppingCart.getAmount());
		
		System.out.println(shoppingCart.toString());
	}

}
