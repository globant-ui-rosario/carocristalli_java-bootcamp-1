package Topic4.rest;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String username;
	private String password;
	private String mail;
	private String creditCardNumber;
	private Photo photo;
	private List<User> friends;
	
	
	public User() {

	}

	public User(String username, String password, String mail, String creditCardNumber, Photo photo, List<User> friends) {

		this.username = username;
		this.password = password;
		this.mail = mail;
		this.creditCardNumber = creditCardNumber;
		this.photo = photo;
		this.friends = friends;
		

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
	
	public Photo getPhoto() {
		return photo;
	}

	public void setPhoto(Photo photo) {
		this.photo = photo;
	}

	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", mail=" + mail + "]";
	}

	public void addFriend(User friend) {
		if(this.friends == null){
			this.friends = new ArrayList<>();		}
		this.friends.add(friend);
		
	}

	public User getFriend(User friend) {
		for(User friend1 : this.friends){
			if(friend1.getUsername().equals(friend.getUsername())){
				return friend;
			}
			
		}
		return null;
	}
	

}
