package Topic4.rest;

public class CreditCard implements Payment {
	
	public double getAmount(ShoppingCartImp shoppingCart) {

		return shoppingCart.getAmount()-shoppingCart.getAmount()*0.1;

}

	public void pay(ShoppingCartImp shoppingCart, int NumberofThePaymentTransaction) {
		System.out.println(shoppingCart.getUser().getUsername()
				+ " paid with a Credit Card which number is "+shoppingCart.getUser().getCreditCardNumber()+
				" a total amount of: $" + shoppingCart.getPayment().getAmount(shoppingCart));
		System.out.println("The number of the Payment Transaction is" + NumberofThePaymentTransaction);

		
	}

}
