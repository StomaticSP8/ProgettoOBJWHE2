package com.example.ProgettoOBJWHE.parset;
import java.text.SimpleDateFormat;
import java.io.*;







public class AttualWheater {
	protected String city="Los Angeles";
	private String date;
	private double pression;
	private double temp_max;
	private double temp_min;
	protected static String Apikey="aa0854721ceebf98625f7753971cd283";
	private Long timeUNIX;
	
	public AttualWheater() {
		
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getPression() {
		return pression;
	}

	public void setPression(double pression) {
		this.pression = pression;
	}

	public double getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}

	public double getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}

	public Long getTimeUNIX() {
		return timeUNIX;
	}

	public void setTimeUNIX(Long timeUNIX) {
		this.timeUNIX = timeUNIX;
	}

	public String getCity() {
		return city;
	}

	public static String getApikey() {
		return Apikey;
	};
	
	
	
	
	
}
