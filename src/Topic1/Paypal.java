package Topic1;

public class Paypal implements Payment {
	
	@Override
	public double getAmount(ShoppingCart shoppingCart) {
		Item item = shoppingCart.getCheapestItem();
		return shoppingCart.getAmount()-item.getUnitPrice()*item.getQuantity();

}

}
