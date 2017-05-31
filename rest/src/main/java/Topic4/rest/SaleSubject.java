package Topic4.rest;

public interface SaleSubject {
	
	public void addObserver(SaleObserver saleObserver);

	public void removeObserver(SaleObserver saleObserver);

	public void doNotify();


}
