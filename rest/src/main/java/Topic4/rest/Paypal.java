package Topic4.rest;

public class Paypal implements Payment {
	
	@Override
	public double getAmount(ShoppingCartImp shoppingCart) {
		Item item = shoppingCart.getCheapestItem();
		return shoppingCart.getAmount()-item.getUnitPrice()*item.getQuantity();

}
	
	@Override
	public void pay(ShoppingCartImp shoppingCart, int NumberofThePaymentTransaction) {
		System.out.println(shoppingCart.getUser().getMail() + " paid $" + shoppingCart.getPayment().getAmount(shoppingCart));
		System.out.println("The number of the Payment Transaction is" + NumberofThePaymentTransaction);
}

}
