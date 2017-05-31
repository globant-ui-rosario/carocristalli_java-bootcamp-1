package Topic4.rest;

public class User {
	
	private String username;
	private String password;
	private String mail;
	private String creditCardNumber;
	
	public User() {

	}

	public User(String username, String password, String mail, String creditCardNumber ) {

		this.username = username;
		this.password = password;
		this.mail = mail;
		this.creditCardNumber = creditCardNumber;
		

}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", mail=" + mail + "]";
	}
	

}
