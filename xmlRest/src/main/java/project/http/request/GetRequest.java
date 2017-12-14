package project.http.request;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class GetRequest {

// effectue une requete get vers l'url passe en parametre
	public static HttpURLConnection request(URL url) throws IOException {

		System.out.println(url);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		return conn;

	}
	
	// effectue une requete get vers l'url passe en parametre sous forme de string
	public static HttpURLConnection request(String urlString) throws IOException {

		URL url = new URL(urlString);
		System.out.println(url);
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		String encoded = Base64.getEncoder().encodeToString(("javarest"+":"+"1234").getBytes(StandardCharsets.UTF_8));  //Java 8
		conn.setRequestProperty("Authorization", "Basic "+encoded);
		conn.setRequestMethod("GET");
		return conn;

	}
}
