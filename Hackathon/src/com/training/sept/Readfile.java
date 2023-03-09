package com.training.sept;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readfile {

	public static void main(String[] args) throws IOException {
		
String sPath="C:\\Users\\aruma\\Documents\\properties\\readfile.txt";
FileReader oFileReader= new FileReader(sPath);
BufferedReader oBufferedReader= new BufferedReader(oFileReader);
//System.out.println(oBufferedReader.readLine());
String str;
while ((str=oBufferedReader.readLine()) !=null) {
	System.out.println(str);
}
String s;
String a = "";
for (int i = 0; i < str.length(); i++) {
//	s=str.r;
}
//	s = str.r(i);
//	a = s + a;
	}

}
