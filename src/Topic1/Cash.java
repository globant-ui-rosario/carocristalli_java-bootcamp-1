package Topic1;

public class Cash implements Payment {
	
	@Override
	public double getAmount(ShoppingCart shoppingCart) {

		return shoppingCart.getAmount();

}

}
