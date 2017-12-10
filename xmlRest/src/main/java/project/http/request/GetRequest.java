package project.http.request;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

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
		conn.setRequestMethod("GET");
		return conn;

	}


}
