
-->project name-Forward Geocoding 

what is forward geocoding?
-->Forward geocoding/Geocoding means you start with an address or location (such as Boston, MA) and end up with latitude and longitude coordinates.

The Google Maps Geocode API has two endpoints:

GET Geocoding: takes a human-readable address, returns location data i.e longitude and latitude

The application calls the rapid geocoding api with address as request parameter.


Steps to generate api key-

1.Getting a Google Maps API Key
link-https://rapidapi.com/googlecloud/api/google-maps-geocoding

2. Subscribe to the Google Maps Geocode API
we will get the api key from here and we can use it in our project

-->Technologies used-
1. java 8
2.spring boot

-->after this add dependencies for the project-

		<dependency>
			<groupId>com.squareup.okhttp3</groupId>
			<artifactId>okhttp</artifactId>
		</dependency>

		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-core</artifactId>    
		</dependency>


-->Next, we will create a Controller that will handle requests to our application and redirect them to the Google Maps API.

-->Running our application

-->then after this go to the browser and enter this url --- http://localhost:8080/geocode?address=Bellandur Bangalore ---
and we will see the api response stored in a new file called "hello.txt" in src/main/resources 

and this is already preloaded in the project 

for example if you want to get the location of a city like(Faridabad,Haryana) jsut go to the browser and type -- http://localhost:8080/geocode?address=Faridabad Haryana --
nd we will see the api response stored in a new file called "Demo.txt" in src/main/resources 

-->If you are seeing this, congrats you have successfully queried the Google Maps API!
