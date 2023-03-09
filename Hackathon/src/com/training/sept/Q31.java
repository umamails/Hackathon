package com.training.sept;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q31 {

	public static void main(String[] args) throws IOException {
		// Q31. Read a file content and write it to a new file in reverse order.(reverse
		// line 1-10 to line 10-1)
		String SPath = "C:\\Users\\aruma\\Desktop\\star\\readfile\\reverseline.txt";
		FileReader ofilereader = new FileReader(SPath);
		BufferedReader oBufferedreader = new BufferedReader(ofilereader);
		int k = 10;
		String array[] = new String[k];
		String array1[] = new String[k];

		for (int i = 0; i < k; i++) {
			array[i] = oBufferedreader.readLine();

		}
		oBufferedreader.close();
		int j = array.length;
		for (int i = 0; i < k; i++) {
			array1[j - 1] = array[i];
			j--;

		}
		String SPath1 = "C:\\Users\\aruma\\Desktop\\star\\readfile\\writeline1.txt";
		//BufferedWriter oBufferwriter = null;
		FileWriter ofilewrite = new FileWriter(SPath1);
		BufferedWriter oBufferwriter = new BufferedWriter(ofilewrite);
		for (int i = 0; i < k; i++) {
			oBufferwriter.write(array1[i] + "\n");	

		}
		oBufferwriter.close();

	}

}
