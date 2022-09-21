package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}


// Generating the api key for geocoding  below//

//OkHttpClient client = new OkHttpClient();
//
//Request request = new Request.Builder()
//	.url("https://google-maps-geocoding.p.rapidapi.com/geocode/json?latlng=40.714224%2C-73.96145&language=en")
//	.get()
//	.addHeader("X-RapidAPI-Key", "75244bf9femsh459698b5946d282p10a526jsn252b57842b30")
//	.addHeader("X-RapidAPI-Host", "google-maps-geocoding.p.rapidapi.com")
//	.build();
//
//Response response = client.newCall(request).execute();