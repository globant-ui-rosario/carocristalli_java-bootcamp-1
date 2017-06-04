package Topic4.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/userService")
public interface UserService {
	
	@GET
	@Consumes({ MediaType.TEXT_PLAIN })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/create/{username, password, mail}")
	public User create(@PathParam("username") String userName, @PathParam("password") String passWord, @PathParam("mail") String mail);

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/read/{username}")
	public User read(@PathParam("username") String username);

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/update/{user}")
	public void update(@PathParam("user") User user);

	@DELETE
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/delete/{user}")
	public void delete(@PathParam("user") User user);

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/addFriend/{user, friend}")
	public void addFriend(@PathParam("user") User user, @PathParam("friend") User friend);

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/addLike/{user}")
public void addLike(@PathParam("user") User user);

}
