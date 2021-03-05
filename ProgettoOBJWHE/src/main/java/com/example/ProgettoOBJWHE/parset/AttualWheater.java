package com.example.ProgettoOBJWHE.parset;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.TimeZone;


import org.json.simple.JSONObject;








public class AttualWheater {
	protected String city="Los Angeles";
	private String date;
	private double pression;
	//private double temp_max;
	//private double temp_min;
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

	/*public double getTemp_max() {
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
	}*/

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
	}
	
	public void parsing() {}
	
	/**
	 * assegna un valore a tutti gli attributi della classe madre WeatherParser 
	 * prendendoli dal jsonObject passato come parametro
	 * @param obj the json object
	 */
	
	
	public void Setall(JSONObject obj) {
		this.setTimeUNIX((Long) obj.get("dt"));
		this.setDate(Dataformatter());
		this.setPression((Double)Double.parseDouble(obj.get("pressure").toString()));
	}
	
	/**
	 * formattatore un json object relativo al dataset
	 * @return JSONObject
	 */
	@SuppressWarnings("unchecked")
	 public JSONObject formatter() {
		 JSONObject json=new JSONObject();
		 json.put("city", this.city);
		 json.put("timeUNIX", this.timeUNIX);
		 json.put("date", this.date);
		 json.put("pression", this.pression);
		 
		 return json;
	 }
	
	/**
	 * formatta una data a partire dal tempo UNIX 
	 * @return dateFromTimeUnix
	 */
	 
	 public String Dataformatter() {
		 Date data=new Date(this.timeUNIX*1000L);
		 SimpleDateFormat formatdata=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 formatdata.setTimeZone(TimeZone.getTimeZone("GMT"));
		 String datadalUNIX=formatdata.format(data);
		 return datadalUNIX;
	 }
	
	
	
	
}
