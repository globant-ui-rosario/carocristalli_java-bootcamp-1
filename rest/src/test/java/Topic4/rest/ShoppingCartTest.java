package Topic4.rest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class ShoppingCartTest extends TestCase {
	
	@Test
	public void testGetAListOfItems() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		List<Item> items = buildListOfItems();
		shoppingCart.addItems(items);
		
		assertEquals(items, shoppingCart.getItems());

	}
	
	@Test
	public void testDeleteItem() {	
		ShoppingCart shoppingCart = new ShoppingCartImp();
		Item item = new Item (2,"Jacket",2);
		List<Item> items = buildListOfItems();
		
		shoppingCart.addItems(items);
		shoppingCart.deleteAnItemFromTheList(item);
		items.remove(item);
		
		assertEquals(items, shoppingCart.getItems());

	}
	
	
	private List<Item> buildListOfItems() {
		
		List<Item> items = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			items.add(new Item(i,"Jacket",2));
		}
		
		return items;
		
	}
/*
	@Test
	public void testAddAnItemToTheList() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		Item item = new Item(1);
		shoppingCart.addAnItemToTheList(item);
		assertEquals(shoppingCart.getAnItemFromTheList(item), item);

	}

	@Test
	public void testDeleteAnItemToTheList() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		Item item = new Item(1);
		shoppingCart.addAnItemToTheList(item);
		assertEquals(shoppingCart.getAnItemFromTheList(item), item);
		shoppingCart.deleteAnItemFromTheList(item);
		assertEquals(shoppingCart.getAnItemFromTheList(item), null);

	}

	@Test
	public void testGetAndSetAcustomer() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		Customer customer = new Customer();
		shoppingCart.setTheCustomer(customer);
		assertEquals(shoppingCart.getTheCustomer(), customer);

	}

	
	@Test
	public void testGetTotalAmount() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		List<Item> myItems = new ArrayList<>();
		double myTotalAmount = 0;
		
		for (int i = 0; i <= 10; i++) {
			myItems.add(new Item(1, i));
			myTotalAmount +=i;
		}
		
		
		shoppingCart.addAlistOfItems(myItems);
		assertEquals(new Double(myTotalAmount),new Double(shoppingCart.getTotalAmount()));
		
} */

}
