package project.dataflow;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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


@Path("cr")
public class CentreRechercheManager {

	/**
	 * Liste les centres de recheches
	 * Service Rest
	 * @return
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
			String res = "";
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			Crs centreRecherche = (Crs) unmarshaller.unmarshal(new File("./src/main/resources/cr/bastriCris.xml"));

			res += gson.toJson(centreRecherche);

			// System.out.println("resultat ="+ res);
			return res += "";

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "fail";

	}

	/**
	 * retourne le centre de recheche qui correspond au siid
	 * 
	 * @param siid
	 * @return
	 * @throws JAXBException
	 */
	public Cr getCr(String siid) throws JAXBException {
		JAXBContext jc;
		jc = JAXBContext.newInstance("org.inria.fr.ns.cr");

		Unmarshaller unmarshaller = jc.createUnmarshaller();

		Crs centreRecherche = (Crs) unmarshaller.unmarshal(new File("./src/main/resources/cr/bastriCris.xml"));
		for (Cr cr : centreRecherche.getCr()) {
			if (cr.getSiid().compareToIgnoreCase(siid) == 0) {
				return cr;
			}
		}
		return null;
	}

	/**
	 * retourne le centre de recheche qui correspond au siid
	 * Service Rest
	 * @param siid
	 * @return
	 */
	@Path("getCr-{siidCr}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getCrRest(@PathParam("siidCr") String siid) {

		final GsonBuilder builder = new GsonBuilder();
		final Gson gson = builder.create();
		Cr cr;
		String res = "";
		try {
			cr = getCr(siid);
			res += gson.toJson(cr);

			// System.out.println("resultat ="+ res);
			return res += "";

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "fail";

	}
}
