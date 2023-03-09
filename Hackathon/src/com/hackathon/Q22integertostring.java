package com.hackathon;

import java.util.Scanner;

public class Q22integertostring {

	public static void main(String[] args) {
		//Q21. WJP to convert string to int
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer: ");
		int a = sc.nextInt();
	String s=Integer.toString(a);
		System.out.println("converted  integer to string value: "+s);
	}

}
