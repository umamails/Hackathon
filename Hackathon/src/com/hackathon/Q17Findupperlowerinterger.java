package com.hackathon;

import java.util.Scanner;

public class Q17Findupperlowerinterger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		sc.close();
		int upperCase = 0;
		int lowerCase = 0;
		int num = 0;
		int spl = 0;
		for (int i = 0; i < s.length(); i++) {
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
