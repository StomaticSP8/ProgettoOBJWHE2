package com.example.ProgettoOBJWHE.dataset;

import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.example.ProgettoOBJWHE.parset.ParserCurrentData;

public class datimeteo {
	JSONObject jsonObjectFormatted = new JSONObject();
	public datimeteo() {
		ParserCurrentData daticorrenti=new ParserCurrentData();
		try {
			daticorrenti.parsing();
			jsonObjectFormatted=daticorrenti.formatter();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*String line;
		line=daticorrenti.toString();
		System.out.println(line);*/
		
	}public JSONObject getJsonObjectFormatted() {
		return jsonObjectFormatted;
	}

}
