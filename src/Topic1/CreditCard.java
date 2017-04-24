package Topic1;

public class CreditCard implements Payment {
	
	@Override
	public double getAmount(ShoppingCart shoppingCart) {

		return shoppingCart.getAmount()-shoppingCart.getAmount()*0.1;

}

}
