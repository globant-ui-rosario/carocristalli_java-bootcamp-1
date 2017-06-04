package Topic4.rest;

public interface Payment {

	double getAmount(ShoppingCartImp shoppingCart);

	void pay(ShoppingCartImp shoppingCart, int NumberofThePaymentTransaction);

}
