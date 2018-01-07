package project.http.request;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;


public class HUCManager {
	
	HttpURLConnection conn;


	public HUCManager(HttpURLConnection conn) {
		
		this.conn = conn;
	}


	public void afficheMessageStdout() throws IOException {
	
			System.out.println();
		
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;
		String result = "";
		while ((line = rd.readLine()) != null) {
			result += line;
		}
		rd.close();
		System.out.println(result.toString());
		
	}
	
	
	

	public String getMessage() throws IOException {
		
		
	
	BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	String line;
	String result = "";
	while ((line = rd.readLine()) != null) {
		result += line;
	}
	rd.close();
	return result.toString();
	
}
	
	public InputStream getInputStream() throws IOException {
		
		return conn.getInputStream();
		
	}
	
	public String toFileResponse(File f) throws IOException {
		
		
		
		
		FileWriter fw = new FileWriter(f);
		String msg = this.getMessage();
		System.out.println(msg);
		fw.write(msg);
		fw.close();
		return f.getName();
	
}
	

}
