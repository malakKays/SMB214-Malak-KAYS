package test;
import java.io.StringReader;

import javax.json.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("books")
public class Test extends Application {
	Livre livre;
	public Test(){
		
		livre = new Livre(1,"REST","malak");
	}
	@GET
	@Path("book")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTitle(@QueryParam("id") int id){
		String title = "REST";
		JsonObject body = Json.createObjectBuilder().add(title,1).build();
		
		return Response.status(200).entity(body).build();
	}
	
}
