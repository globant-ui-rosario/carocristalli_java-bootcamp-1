package Topic4.rest;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImp implements UserService {
	
	private List<User> users = new ArrayList<>();

	@Override
	public User create(String username, String passWord, String mail) {
		User user = new User(username, passWord, mail,null,null,null);
		users.add(user);
		return user;
	}

	@Override
	public User read(String username) {
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				return user;
				
			}
		}

		return null;
	}

	@Override
	public void update(User user) {
		User user1 = this.read(user.getUsername());
		users.remove(user1);
		users.add(user1);
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		
	}

	@Override
	public void addFriend(User user, User friend) {
		user.addFriend(friend);
		this.update(user);
		
	}

	@Override
	public void addLike(User user) {
		System.out.println("caas");
		user.getPhoto().addLike();
		this.update(user);
		
	}

}
