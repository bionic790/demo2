package com.example.demo;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URLEncoder;

@RestController
@Cacheable("address")
public class GeocodeController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@RequestMapping(path = "/geocode", method = RequestMethod.GET)
	public void getGeocode(@RequestParam String address) throws IOException {

		try {
			
			//location where result is stored
//			final String filepath = "C:\\Users\\acer\\geocoding2\\demo\\src\\main\\resources\\Hello.txt";
			final String filepath = "C:\\Users\\acer\\geocodingapi\\demo\\src\\main\\resources\\Demo.txt";
			
			//just change the file name in line 32 to get geocoding location of other city 
			//helps in response caching 
			OkHttpClient client = new OkHttpClient();
			
			//used for html form encoding ,makes the form of URL more reliable and secure
			String encodedAddress = URLEncoder.encode(address, "UTF-8");
			
			//to send a new request to client
			Request request = new Request.Builder()
					.url("https://google-maps-geocoding.p.rapidapi.com/geocode/json?language=en&address="
							+ encodedAddress)
					.get().addHeader("x-rapidapi-host", "google-maps-geocoding.p.rapidapi.com")
					.addHeader("x-rapidapi-key", "75244bf9femsh459698b5946d282p10a526jsn252b57842b30").build();

				//here the response from client is collected in response body
			ResponseBody responseBody = client.newCall(request).execute().body();
			
			
			// String answer =responseBody.string();
			// System.out.println(answer);
			
			//to print object in a file
			FileOutputStream fileOut = new FileOutputStream(filepath);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(responseBody.string());
			objectOut.close();
			System.out.println("The Object  was succesfully written to a file");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
