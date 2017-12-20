package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;

import project.http.request.GetRequest;
import project.http.request.HUCManager;

public class ScheduleUpdate {
	
	public static void run(){
	try {
		HttpURLConnection bastriCo = GetRequest.request("http://www-sop.inria.fr/members/Philippe.Poulard/projet/2017/bastri.xml");
		HUCManager conn = new HUCManager(bastriCo);
		String xmlBastri = conn.getMessage();
		File f = new File("src/main/resources/sr/bastri.xml");
		FileWriter fw = new FileWriter(f);
		fw.write(xmlBastri);
		fw.close();
		System.out.println("Mise a jour reussi du fichier bastri.xml");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		HttpURLConnection bastriCo = GetRequest.request("http://www-sop.inria.fr/members/Philippe.Poulard/projet/2017/bastriCris.xml");
		HUCManager conn = new HUCManager(bastriCo);
		String xmlBastri = conn.getMessage();
		File f = new File("src/main/resources/cr/bastriCris.xml");
		FileWriter fw = new FileWriter(f);
		fw.write(xmlBastri);
		fw.close();
		System.out.println("Mise a jour reussi du fichier bastriCris.xml");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
