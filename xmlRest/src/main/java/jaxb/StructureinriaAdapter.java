package jaxb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;

import org.inria.fr.ns.sr.Domaine;
import org.inria.fr.ns.sr.Entite;
import org.inria.fr.ns.sr.Keywords;
import org.inria.fr.ns.sr.Resume;
import org.inria.fr.ns.sr.Structureinria;
import org.inria.fr.ns.sr.Theme;
import org.inria.fr.ns.sr.UrlTeam;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/*
public class StructureinriaAdapter extends XmlAdapter <String, Structureinria> {
	
	Structureinria si = new Structureinria();
	String res = "";

	@Override
	public Structureinria unmarshal(String v) throws Exception {
		si.setSiid(v);
		return si;
	}

	@Override
	public String marshal(Structureinria v) throws Exception {
		res = "Structure Inria : /n";
		res += "SiidEquipeGroupe" + "/n";
		res += v.getSiidEquipeGroupe() + "/n";
		
		res += "UrlTeam" + "/n";
		for (UrlTeam tmp: v.getUrlTeam()){
            res += tmp.toString() + "/n";
        }
		
		res += "Keywords" + "/n";
		for (Keywords tmp: v.getKeywords()){
            res += tmp.toString() + "/n";
        }
		
		res += "Sigle" + "/n";
		res += v.getSigle() + "/n";
		
		res += "SigleHtml" + "/n";
		res += v.getSigleHtml() + "/n";
		
		res += "SigleLatex" + "/n";
		res += v.getSigleLatex() + "/n";
		
		res += "Typestructure" + "/n";
		res += v.getTypestructure() + "/n";
		
		res += "Libellefr" + "/n";
		res += v.getLibellefr() + "/n";
		
		res += "Libelleen" + "/n";
		res += v.getLibelleen() + "/n";
		
		res += "Domaine" + "/n";
		for (Domaine tmp: v.getDomaine()){
            res += tmp.toString() + "/n";
        }
		
		res += "Theme" + "/n";
		for (Theme tmp: v.getTheme()){
            res += tmp.toString() + "/n";
        }
		
		res += "Entite" + "/n";
		for (Entite tmp: v.getEntite()){
            res += tmp.toString() + "/n";
        }
		
		res += "Idhal" + "/n";
		res += v.getIdhal() + "/n";
		
		res += "Resume" + "/n";
		for (Resume tmp: v.getResume()){
            res += tmp.toString() + "/n";
        }
		
		res += "Siid" + "/n";
		res += v.getSiid() + "/n";
		
		res += "Numnatstruct" + "/n";
		res += v.getNumnatstruct() + "/n";
		
		return res;
	}
	*/

public class StructureinriaAdapter extends XmlAdapter<JAXBElement<? extends Structureinria>, Structureinria> {

	@SuppressWarnings("unchecked")
	@Override
	public JAXBElement<Structureinria> marshal(Structureinria v) throws Exception {
		QName name = new QName("xs:element");
		return new JAXBElement<Structureinria>(name, (Class<Structureinria>) v.getClass(), v);
	}

	@Override
	public Structureinria unmarshal(JAXBElement<? extends Structureinria> v) throws Exception {
		return v.getValue();
	}

}
