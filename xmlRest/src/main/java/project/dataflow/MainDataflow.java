package project.dataflow;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import fr.inria.ns.dsi.si.app.bastri.StructureInrias;
import fr.inria.ns.dsi.si.app.bastri.Structureinria;

public class MainDataflow {

	public static void main(String[] args) {
		try {
		      JAXBContext jc = JAXBContext.newInstance("fr.inria.ns.dsi.si.app.bastri");
		      Unmarshaller unmarshaller = jc.createUnmarshaller();

		      StructureInrias struc = (StructureInrias) unmarshaller.unmarshal(new File("./src/main/resources/bastri.xml"));

		      List<Structureinria> listStruc = struc.getStructureinria();
		      
		      for (Structureinria structureinria : listStruc) {
				System.out.println(structureinria.getLibellefr());
			}
		      
		    
		      
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		  }
	}


