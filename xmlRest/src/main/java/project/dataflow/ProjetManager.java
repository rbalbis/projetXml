package project.dataflow;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.inria.fr.ns.cr.Crs.Cr;
import org.inria.fr.ns.sr.Entite;
import org.inria.fr.ns.sr.StructureInrias;
import org.inria.fr.ns.sr.Structureinria;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Path("sr")
public class ProjetManager {
	
	 @Context
	    private HttpServletResponse servletResponse;

	    private void allowCrossDomainAccess() {
	        if (servletResponse != null){
	            servletResponse.setHeader("Access-Control-Allow-Origin", "*");
	        }
	    }
	@Path("listProject")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String listProject() {
		 allowCrossDomainAccess();
		JAXBContext jc;
		final GsonBuilder builder = new GsonBuilder();
	    final Gson gson = builder.create();
		try {
			jc = JAXBContext.newInstance("org.inria.fr.ns.sr");
			String res = "";
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			
			 StructureInrias sis = (StructureInrias) unmarshaller.unmarshal(new File("./src/main/resources/sr/bastri.xml"));
			
		
				res += gson.toJson(sis);
				
			
			
			//System.out.println("resultat ="+ res);
			return res;

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "fail";

	}
	
	public HashMap<String, Integer> compteTeamParCentre() throws JAXBException{
	    HashMap<String, Integer> hashCR = new HashMap<String,Integer>();
		JAXBContext jc;
	
			jc = JAXBContext.newInstance("org.inria.fr.ns.sr");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			
			 StructureInrias sis = (StructureInrias) unmarshaller.unmarshal(new File("./src/main/resources/sr/bastri.xml"));
			 List<Structureinria> si = sis.getStructureinria();
		for (Structureinria structureinria : si) {
			for(Entite entite :structureinria.getEntite()){
				String siid = entite.getAdressegeographique().getCri().getSiid();
				if(hashCR.containsKey(siid)){hashCR.put(siid, hashCR.get(siid)+1);}
				else{
					hashCR.put(siid, 1);

				}
			}
		}
		return hashCR;
	}
	

	
	@Path("teamParCentre")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String teamParCentre() {
		 allowCrossDomainAccess();
		final GsonBuilder builder = new GsonBuilder();
	    final Gson gson = builder.create();
		try {
			HashMap<String, Integer> hashCR = compteTeamParCentre();
			
			String res = gson.toJson(hashCR);
			//System.out.println("resultat ="+ res);
			return res;

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "fail";
	}
	
	

	@Path("getProjectFromCr-{siidCr}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getProjectFromCrRest(@PathParam("siidCr") String siid) {
		 allowCrossDomainAccess();
		final GsonBuilder builder = new GsonBuilder();
		final Gson gson = builder.create();
		Cr cr;
		JAXBContext jc;
		HashMap<String, Structureinria> hash = new HashMap<>();
		try {
			jc = JAXBContext.newInstance("org.inria.fr.ns.sr");
			String res = "";
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			StructureInrias sis = (StructureInrias) unmarshaller.unmarshal(new File("./src/main/resources/sr/bastri.xml"));
			List<Structureinria> listsis = sis.getStructureinria();
			for (Structureinria structureinria : listsis) {
				for(Entite entt : structureinria.getEntite()) {
					if(entt.getAdressegeographique().getCri().getSiid().compareToIgnoreCase(siid) == 0) {
						hash.put(entt.getSigle(), structureinria);
					}
				}
			}
			
			
			
			
			res += gson.toJson(hash);

			// System.out.println("resultat ="+ res);
			return res;

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "fail";

	}


}
