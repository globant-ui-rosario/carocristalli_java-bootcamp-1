package Topic4.rest;

public class MailObserver implements SaleObserver {

	public void doUpdate(String operation) {
		System.out.println("Sending e-mails to people who are on a mailing list - " + operation);
		
	}

}
