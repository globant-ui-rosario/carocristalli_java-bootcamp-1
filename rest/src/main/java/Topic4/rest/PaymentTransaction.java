package Topic4.rest;

import java.util.ArrayList;
import java.util.List;

public class PaymentTransaction implements SaleSubject {
	
	private int number;
	private List<SaleObserver> observers;

	public PaymentTransaction() {
		this.number = 0;
		this.observers = new ArrayList<>();
	}

	public int newTransaction() {

		this.number++;
		this.doNotify();
		return this.number;

	}

	public void abortTransaction() {

		this.number--;
	}


	@Override
	public void addObserver(SaleObserver saleObserver) {
		this.observers.add(saleObserver);
		
	}

	@Override
	public void removeObserver(SaleObserver saleObserver) {
		this.observers.remove(saleObserver);
		
	}

	@Override
	public void doNotify() {
		for (SaleObserver saleObserver : this.observers) {
			saleObserver.doUpdate("Payment Transaction");
		}
		
	}

}
