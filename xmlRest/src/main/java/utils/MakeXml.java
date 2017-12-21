package utils;

public class MakeXml {

	
	public static String makeXmlWithData(String balise,String data){
		return String.format("<%s>%s</%s>", balise,data,balise);
	}
}
