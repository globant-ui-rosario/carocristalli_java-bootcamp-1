package KeyPointsFrom1To6;

public class MailObserver implements SaleObserver {

	@Override
	public void doUpdate(String operation) {
		System.out.println("Sending e-mails to people who are on a mailing list - " + operation);
		
	}

}
