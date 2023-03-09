package com.hackathon;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		// Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		sc.close();
		int upperCase = 0;
		int lowerCase = 0;
		int num = 0;
		int spl = 0;
		for (int i = 0; i < s.length(); i++) {
			/*
			 * for(int j+1;j<s.length();j++) { // if() }
			 */
			if (Character.isDigit(s.charAt(i))) {
				num++;
			} else if (Character.isUpperCase(s.charAt(i))) {
				upperCase++;
			} else if (Character.isLowerCase(s.charAt(i))) {
				lowerCase++;
			}

		}
		System.out.println("Interger - " + num);
		System.out.println("Uppercase - " + upperCase);
		System.out.println("LowerCase - " + lowerCase);

	}

}
	

