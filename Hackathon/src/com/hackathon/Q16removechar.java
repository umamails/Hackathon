package com.hackathon;

import java.util.Scanner;

public class Q16removechar {

	public static void main(String[] args) {
		// Q16. Write a method that will remove given character from the String?
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s = sc.next();
		System.out.println("enter the character to remove: ");
		String c = sc.next();
		//char chargetArray[]=new char[s.length()];
		//for(int i=0;i<s.length();i++) {
			//chargetArray[i]=s.charAt(i);
	
		
	System.out.println(s.replaceAll(c, ""));

	}
}

