package Domain;

public class Cash implements Payment {
	
	@Override
	public double getAmount(ShoppingCart shoppingCart) {

		return shoppingCart.getAmount();

}

	@Override
	public void pay(ShoppingCart shoppingCart, int NumberofThePaymentTransaction) {
		System.out.println(shoppingCart.getUser().getUsername() + " paid $" + shoppingCart.getPayment().getAmount(shoppingCart));
		System.out.println("The number of the Payment Transaction is" + NumberofThePaymentTransaction);

		
	}

}
