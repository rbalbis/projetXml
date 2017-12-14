package project.dataflow;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.inria.fr.ns.sr.StructureInrias;
import org.inria.fr.ns.sr.Structureinria;


public class MainDataflow {

	public static void main(String[] args) {
		try {
		      JAXBContext jc = JAXBContext.newInstance("org.inria.fr.ns.sr");
		      Unmarshaller unmarshaller = jc.createUnmarshaller();

		      StructureInrias struc = (StructureInrias) unmarshaller.unmarshal(new File("./src/main/resources/sr/bastri.xml"));

		      List<Structureinria> listStruc = struc.getStructureinria();
		      
		      for (Structureinria structureinria : listStruc) {
				System.out.println(structureinria.getLibellefr());
				System.out.println();
			}
		      
		    
		      
		    } catch (Exception e) {
		      e.printStackTrace();
		    }
		  }
	}


