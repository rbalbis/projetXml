package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import project.http.request.GetRequest;
import project.http.request.HUCManager;

public class ScheduleUpdate extends TimerTask{
	
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		today.set(Calendar.HOUR_OF_DAY, 2);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);

		// every night at 2am you run your task
		Timer timer = new Timer();
		timer.schedule(new ScheduleUpdate(), today.getTime(), TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
	}
	
	public void run(){
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
