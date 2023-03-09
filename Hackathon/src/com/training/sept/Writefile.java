package com.training.sept;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {

	public static void main(String[] args) throws IOException {
		String sPath = "C:\\Users\\aruma\\Documents\\properties\\writefile.txt";
		BufferedWriter oBufferwriter= null;
		try {
			FileWriter oFilewriter = new FileWriter(sPath);
			oBufferwriter = new BufferedWriter(oFilewriter);
			oBufferwriter.write("Welcome to Java Training");
			oBufferwriter.write("\n");
			oBufferwriter.write("Java Advance Training is in" +"\n");
			oBufferwriter.write("Java Advance Training is in"+"\n");
			oBufferwriter.write("Java Advance Training is in");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			oBufferwriter.close();
			System.out.println("file writing is completed");
		}

	}

}
