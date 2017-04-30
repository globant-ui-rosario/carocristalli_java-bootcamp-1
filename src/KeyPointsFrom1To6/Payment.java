package KeyPointsFrom1To6;

public interface Payment {

	double getAmount(ShoppingCart shoppingCart);

	void pay(ShoppingCart shoppingCart, int NumberofThePaymentTransaction);

}
