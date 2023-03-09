package com.hackathon;

import java.util.Scanner;

public class Q13reversestring {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the String to reverse: ");
		String s1 = sc1.nextLine();
		
		String a = "";
		sc1.close();
		for (int i = 0; i < s1.length(); i++) {
			a = s1.charAt(i)+a;
			
		}
		System.out.println("Reversed String is: " + a);
	}

}
