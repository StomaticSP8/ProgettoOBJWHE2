package com.example.ProgettoOBJWHE.dataset;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Dataset {
	
	public void reader() throws IOException {
	
	try {
		BufferedReader read=new BufferedReader(new FileReader("pressure.txt"));
		
		
		
		String dati;
		dati=read.readLine();
		read.close();
		System.out.println(dati);
		
		
	
	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
