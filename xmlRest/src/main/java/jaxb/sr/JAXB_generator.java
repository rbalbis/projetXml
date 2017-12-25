package jaxb.sr;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.inria.fr.ns.sr.StructureInrias;
import org.inria.fr.ns.sr.Structureinria;

public class JAXB_generator {

	public static void main(String[] args) {
		try {
			JAXBContext jc = JAXBContext.newInstance("org.inria.fr.ns.sr");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			//StructureInrias structureInrias = structureInrias.createStructureInrias();
			StructureInrias structureInrias = (StructureInrias) unmarshaller.unmarshal(new File("src/main/resources/sr/bastri.xml"));
			List<Structureinria> structureinrias = structureInrias.getStructureinria();
			for (int i = 0; i < structureinrias.size(); i++) {
				Structureinria uneStructureInria = structureinrias.get(i);
				System.out.println("Structure Inria ");
				System.out.println("ID : " + uneStructureInria.getSiid());
				System.out.println("Date creation : " + uneStructureInria.getDateCreation());
				System.out.println("Date fermeture : " + uneStructureInria.getDateFermeture());
				System.out.println("--------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}