package Topic4.rest;

public interface Payment {

	double getAmount(ShoppingCart shoppingCart);

	void pay(ShoppingCart shoppingCart, int NumberofThePaymentTransaction);

}
