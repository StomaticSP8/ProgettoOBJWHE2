package com.example.ProgettoOBJWHE.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProgettoOBJWHE.dataset.Dataset;
import com.example.ProgettoOBJWHE.dataset.datimeteo;

@RestController 

public class controller {
	
	@GetMapping(value="/metadata/weather")
	public JSONObject givemedata() {
		datimeteo dati=new datimeteo();
		
		return dati.getJsonObjectFormatted();
		
		
	}
	
	

}
