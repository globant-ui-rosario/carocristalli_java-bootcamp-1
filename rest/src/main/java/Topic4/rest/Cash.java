package Topic4.rest;

public class Cash implements Payment {
	
	public double getAmount(ShoppingCartImp shoppingCart) {

		return shoppingCart.getAmount();

}

	public void pay(ShoppingCartImp shoppingCart, int NumberofThePaymentTransaction) {
		System.out.println(shoppingCart.getUser().getUsername() + " paid $" + shoppingCart.getPayment().getAmount(shoppingCart));
		System.out.println("The number of the Payment Transaction is" + NumberofThePaymentTransaction);

		
	}

}
