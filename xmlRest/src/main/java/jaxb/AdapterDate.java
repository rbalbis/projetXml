package jaxb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;

import org.inria.fr.ns.sr.Structureinria;
import org.inria.fr.ns.sr.UrlTeam;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class AdapterDate extends XmlAdapter<String, LocalDate> {

	DateFormat df = new SimpleDateFormat("DD/MM/YYY");
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YYY");
	
	public LocalDate unmarshal(String date) throws Exception {
		return LocalDate.parse(date, formatter);
	}
	
	public String marshal(LocalDate date) throws Exception {
		return df.format(date);
	}

}
	