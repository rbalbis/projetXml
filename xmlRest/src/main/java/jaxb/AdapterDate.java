package jaxb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class AdapterDate extends XmlAdapter<String, Date> {

	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public Date unmarshal(String date) throws Exception {
		return df.parse(date);
	}
	
	public String marshal(Date date) throws Exception {
		return df.format(date);
	}
}
	