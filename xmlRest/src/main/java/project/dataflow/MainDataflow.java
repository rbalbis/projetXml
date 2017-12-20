package project.dataflow;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.inria.fr.ns.sr.Entite;
import org.inria.fr.ns.sr.StructureInrias;
import org.inria.fr.ns.sr.Structureinria;

import project.http.request.GetRequest;
import project.http.request.HUCManager;
import utils.ScheduleUpdate;


public class MainDataflow {

	public static void main(String[] args) {
		try {
		      JAXBContext jc = JAXBContext.newInstance("org.inria.fr.ns.sr");
		      Unmarshaller unmarshaller = jc.createUnmarshaller();

		      StructureInrias struc = (StructureInrias) unmarshaller.unmarshal(new File("./src/main/resources/sr/bastri.xml"));

		      List<Structureinria> listStruc = struc.getStructureinria();
		      
		      for (Structureinria structureinria : listStruc) {
		    	  String enty = structureinria.getEntite().get(0).getAdressegeographique().getCri().getSiid();
		    	  if(enty.compareToIgnoreCase("CR0008I") == 0){
		    		  List<Entite> en = structureinria.getEntite();
		    		  for (Entite entite : en) {

		  				System.out.println(entite.getAdressegeographique().getAdresse());}
					}
				
			}
		      
		    
		      
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		
		ScheduleUpdate.run();
		  }
	}


