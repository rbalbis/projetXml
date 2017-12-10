package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import project.http.request.GetRequest;
import project.http.request.HUCManager;

@Path("xquery")
public class TestProjet1 {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getXml() {
		return "bonjour Robin";
	}
	
	/**
	 * accesible depuis http://localhost:8080/xml.rest/xquery/afficheCount-ACACIA 
	 * Fait un appel get a la fonction qui compte 
	 * @param projet
	 * @return
	 */
	@Path("afficheCount-{projet}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getXml(@PathParam("projet") String projet) {
			try {
				HttpURLConnection conn = GetRequest.request("http://localhost:8088/exist/rest/afficheCount.xq?proj="+projet);
				HUCManager huc = new HUCManager(conn);
				return huc.getMessage();
			} catch (IOException e) {
				System.err.println("Probleme connection base de donnee, tentative de connection a : \" http://localhost:8088/exist/rest/afficheCount.xq?proj="+ projet + "\"");
				e.printStackTrace();
			}
			return "FAILED";
			
			
	}
			

}
