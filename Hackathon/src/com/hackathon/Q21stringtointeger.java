package com.hackathon;

import java.util.Scanner;

public class Q21stringtointeger {

	public static void main(String[] args) {
		//Q21. WJP to convert string to int
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s = sc.next();
		int a=Integer.parseInt(s);
		System.out.println("converted string to integer value: "+a);
	}

}
