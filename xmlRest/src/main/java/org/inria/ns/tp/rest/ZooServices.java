package org.inria.ns.tp.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("welcome.txt")
public class ZooServices {

	@GET
	@Produces("text/plain")
	public String getXml() {
		return "Bonjour";
	}

}
