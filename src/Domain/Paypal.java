package Domain;

public class Paypal implements Payment {
	
	@Override
	public double getAmount(ShoppingCart shoppingCart) {
		Item item = shoppingCart.getCheapestItem();
		return shoppingCart.getAmount()-item.getUnitPrice()*item.getQuantity();

}
	
	@Override
	public void pay(ShoppingCart shoppingCart, int NumberofThePaymentTransaction) {
		System.out.println(shoppingCart.getUser().getMail() + " paid $" + shoppingCart.getPayment().getAmount(shoppingCart));
		System.out.println("The number of the Payment Transaction is" + NumberofThePaymentTransaction);
}

}
