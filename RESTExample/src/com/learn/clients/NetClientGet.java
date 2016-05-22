package com.learn.clients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NetClientGet {

	public static void main(String[] args) {
		try {

			//Change the URL as per port of tomcat server // can check on chrome browser as-well
			//URL url = new URL("http://localhost:8090/RESTExample/restExample/ctofservice/"); 
			URL url = new URL("http://localhost:8090/RESTExample/restExample/ftocservice/");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET"); //can comment this line as the default is GET
			
			//Change as per mime type
			//conn.setRequestProperty("Accept", "application/xml"); 
			conn.setRequestProperty("Accept", "application/json"); 
			
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
