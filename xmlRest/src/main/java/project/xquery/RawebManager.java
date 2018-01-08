package project.xquery;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
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

import org.apache.fop.fo.XMLObj;
import org.inria.fr.ns.sr.StructureInrias;
import org.json.XML;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import jaxb.xquery.members.AllMembers;
import jaxb.xquery.members.AllMembers.Member;
import jaxb.xquery.projectsname.Projets;
import project.http.request.GetRequest;
import project.http.request.HUCManager;
import utils.ScheduleUpdate;

@Path("xquery")
public class RawebManager {

	@Context
	private HttpServletResponse servletResponse;

	private void allowCrossDomainAccess() {
		if (servletResponse != null) {
			servletResponse.setHeader("Access-Control-Allow-Origin", "*");
		}
	}

	@Path("projectName")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String listProject() {
		allowCrossDomainAccess();

		JAXBContext jc;
		final GsonBuilder builder = new GsonBuilder();
		final Gson gson = builder.create();
		try {
			HttpURLConnection projectName = GetRequest.request("http://localhost:8088/exist/rest/projects-name.xq");
			HUCManager conn = new HUCManager(projectName);
			jc = JAXBContext.newInstance("jaxb.xquery.projectsname");
			String res = "";
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			Projets sis = (Projets) unmarshaller.unmarshal(conn.getInputStream()); // retourne seulement
																					// {"projet":"ZENITH"}

			res += gson.toJson(sis);

			return res;

		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "fail";

	}

	@Path("getMembers")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getMembers() {
		allowCrossDomainAccess();

		JAXBContext jc;
		final GsonBuilder builder = new GsonBuilder();
		final Gson gson = builder.create();
		try {
			HttpURLConnection projectName = GetRequest.request("http://localhost:8088/exist/rest/list-ALLmembers.xq");
			HUCManager conn = new HUCManager(projectName);
			jc = JAXBContext.newInstance("jaxb.xquery.members");
			String res = "";
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			AllMembers sis = (AllMembers) unmarshaller.unmarshal(conn.getInputStream()); // retourne seulement
																							// {"projet":"ZENITH"}

			res += gson.toJson(sis);

			return res;

		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "fail";

	}

	@Path("getMembers-{firstName}/{lastName}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getMembers(@PathParam("firstName") String firstName, @PathParam("lastName") String lastName) {
		allowCrossDomainAccess();

		JAXBContext jc;
		final GsonBuilder builder = new GsonBuilder();
		final Gson gson = builder.create();
		try {
			HttpURLConnection projectName = GetRequest.request("http://localhost:8088/exist/rest/list-ALLmembers.xq");
			HUCManager conn = new HUCManager(projectName);
			jc = JAXBContext.newInstance("jaxb.xquery.members");
			String res = "";
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			AllMembers membre = (AllMembers) unmarshaller.unmarshal(conn.getInputStream());
			List<Member> listmembre = membre.getMember();
			for (Member member : listmembre) {
				if ((member.getFirstname().compareToIgnoreCase(firstName) == 0)
						&& (member.getLastname().compareToIgnoreCase(lastName) == 0)) {
					res += gson.toJson(member);

					return res;
				}

			}

		} catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "fail";

	}

	@Path("getProject-{project}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getProject(@PathParam("project") String project) {
		allowCrossDomainAccess();
		final GsonBuilder builder = new GsonBuilder();
		final Gson gson = builder.create();

		HttpURLConnection projectName;
		try {
			projectName = GetRequest.request("http://localhost:8088/exist/rest/raweb/" + project.toLowerCase() + ".xml");

			HUCManager conn = new HUCManager(projectName);
return XML.toJSONObject(conn.getMessage()).toString();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}

	}

}
