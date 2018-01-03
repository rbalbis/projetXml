package project.xquery;

import java.io.IOException;
import java.net.HttpURLConnection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.inria.fr.ns.sr.StructureInrias;
import org.xml.sax.InputSource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import jaxb.xquery.Projets;
import project.http.request.GetRequest;
import project.http.request.HUCManager;

@Path("xquery")
public class RawebManager {

		@Path("projectName")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public String listProject() {
			JAXBContext jc;
			final GsonBuilder builder = new GsonBuilder();
		    final Gson gson = builder.create();
			try {
				HttpURLConnection projectName = GetRequest.request("http://localhost:8088/exist/rest/projects-name.xq");
				HUCManager conn = new HUCManager(projectName);
				jc = JAXBContext.newInstance("jaxb.xquery");
				String res = "";
				Unmarshaller unmarshaller = jc.createUnmarshaller();
				
				
				 Projets sis = (Projets) unmarshaller.unmarshal(conn.getInputStream());  // retourne seulement {"projet":"ZENITH"}
				
			
					res += gson.toJson(sis);
					
				
				
				System.out.println("resultat ="+ res);
				return res;

			} catch (JAXBException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "fail";

		}
		
		
}
