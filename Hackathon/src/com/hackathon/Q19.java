package com.hackathon;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		// WJP to display number of occurrence of all character?

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s = sc.nextLine();
		sc.close();

		// char a[]=new char[s.length()];
		int Counter[] = new int[256];
		for (int i = 0; i < s.length(); i++) {
			Counter[(int) s.charAt(i)]++;
		}
		for (int j = 0; j < 256; j++) {
			if (Counter[j] != 0) {
				System.out.println((char) j + "-- " + Counter[j]);
			}
		}

	}

}
