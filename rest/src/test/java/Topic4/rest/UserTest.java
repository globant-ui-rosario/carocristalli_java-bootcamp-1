package Topic4.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UserTest {
	
	private UserService userService = new UserServiceImp();

	@Test
	public void shouldCreateNewUser() {
		User user = userService.create("carocristalli", "bootcamp", "carocristalli@gmail.com");
		assertEquals(user, userService.read(user.getUsername()));
	}

	@Test
	public void shouldUpdateUser() {
		User user = userService.create("carocristalli", "bootcamp", "carocristalli@gmail.com");
		user.setPassword("bootcamp15");
		userService.update(user);
		User user1 = userService.read(user.getUsername());
		assertEquals("bootcamp15", user1.getPassword());
		
	}

	@Test
	public void shouldDeleteUser() {
		User user = userService.create("carocristalli", "bootcamp", "carocristalli@gmail.com");
		userService.delete(user);
		assertNull(userService.read(user.getUsername()));
		
	}

	@Test
	public void shouldAddFriends() {
		User user = userService.create("carocristalli", "bootcamp", "carocristalli@gmail.com");
		User friend = userService.create("josefina", "utn", "josefina@gmail.com");
		userService.addFriend(user, friend);
		User user1 = userService.read(user.getUsername());
		
		assertEquals(friend, user1.getFriend(friend));
		
	}

	@Test
	public void shouldAddLikes() {
		User user = userService.create("carocristalli", "bootcamp", "carocristalli@gmail.com");
		
		user.setPhoto(new Photo());
		userService.update(user);
		
		userService.addLike(user);
		assertEquals(new Integer(1), new Integer(userService.read(user.getUsername()).getPhoto().getLikes()));
		
}

}
