package Topic4.rest;



import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/shoppingCartService")
public interface ShoppingCart {
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/getItems")
	public List<Item> getItems();

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/addItems/{items}")
	public void addItems(@PathParam("item") List<Item> items);
	
	@DELETE
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/deleteItem/{item}")
	public void deleteAnItemFromTheList(@PathParam("item") Item item);
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/getUser")
	public User getUser();

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/setUser/{user}")
	public void setUser(@PathParam("user") User user);

	

	
	

}
