package com.example.ProgettoOBJWHE.parset;

import java.io.FileNotFoundException;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class ParserCurrentData extends AttualWheater {
	
	
	/**
	 * prende l'API key da file
	 * @return una stringa contenente l'API key presa da file
	 * @throws FileNotFoundException
	 */
	
	/**
	 * metodo che effettua il parsing dell'JSON ritornato dalla chiamata a OpenWeather
	 */
	@Override
	public void parsing() {
		JSONParser parser = new JSONParser();
		JSONObject obj = new JSONObject();
		String jsonResponse = null;
		
		RestTemplate restTemplate = new RestTemplate();
		try {
			jsonResponse = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q="+this.getCity()+
				"&appid="+super.getApikey(), String.class);
			obj = (JSONObject) parser.parse(jsonResponse);
			
		}catch (RestClientException e) {
			e.printStackTrace();
		}  catch (ParseException e) {
			e.printStackTrace();
			}
		Setall(obj);
		
		
	}

	
		
	

}
