package project;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("welcome")
public class TestProjet1 {

	@GET
	@Produces("text/plain")
	public String getXml() {
		return "bonjour Robin";
	}

}
