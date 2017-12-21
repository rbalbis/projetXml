package project.dataflow;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.inria.fr.ns.*;
import org.inria.fr.ns.cr.Crs;
import org.inria.fr.ns.cr.Crs.Cr;
import org.inria.fr.ns.cr.Crs.Cr.Adressegeographique;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import project.http.response.CustomResponse;
import utils.MakeXml;



@Path("cr")
public class MainDataflow {


	/*
	 * @Path("listcr")
	 * 
	 * @GET
	 * 
	 * @Produces(MediaType.APPLICATION_XML) public String listCentreRecherche()
	 * { try { JAXBContext jc = JAXBContext.newInstance("org.inria.fr.ns.sr");
	 * Unmarshaller unmarshaller = jc.createUnmarshaller();
	 * 
	 * StructureInrias struc = (StructureInrias) unmarshaller.unmarshal(new
	 * File("./src/main/resources/sr/bastri.xml"));
	 * 
	 * List<Structureinria> listStruc = struc.getStructureinria();
	 * 
	 * for (Structureinria structureinria : listStruc) { String enty =
	 * structureinria.getEntite().get(0).getAdressegeographique().getCri().
	 * getSiid(); if(enty.compareToIgnoreCase("CR0008I") == 0){ List<Entite> en
	 * = structureinria.getEntite(); for (Entite entite : en) {
	 * 
	 * System.out.println(entite.getAdressegeographique().getAdresse());} }
	 * 
	 * }
	 * 
	 * 
	 * 
	 * } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * ScheduleUpdate.run(); }
	 */

	@Path("listcr")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String listCentreRecherche() {
		JAXBContext jc;
		final GsonBuilder builder = new GsonBuilder();
	    final Gson gson = builder.create();
		try {
			jc = JAXBContext.newInstance("org.inria.fr.ns.cr");
			String res = "{\"data\":";
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			
			Crs centreRecherche = (Crs) unmarshaller.unmarshal(new File("./src/main/resources/cr/bastriCris.xml"));
			for (Cr cr : centreRecherche.getCr()) {
				res += gson.toJson(cr);
				
			}
			
			System.out.println("resultat ="+ res);
			return res+= "}";

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "fail";

	}
	
	
}
