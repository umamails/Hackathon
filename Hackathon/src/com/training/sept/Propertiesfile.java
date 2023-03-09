package com.training.sept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Propertiesfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String sPath = "C:\\Users\\aruma\\Documents\\properties\\application.properties";
		FileInputStream fileinput = new FileInputStream(sPath);
		Properties property = new Properties();
		property.load(fileinput);
		System.out.println(property.get("url"));

		// to add new data to file
	
		FileOutputStream fileout=new FileOutputStream(sPath);
		property.setProperty("password2","test123@new");
		property.save(fileout, " ");
		System.out.println(property.get("password2"));
	}

}
