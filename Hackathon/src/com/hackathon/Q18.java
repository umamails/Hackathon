package com.hackathon;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		// WJP to display duplicate character in string
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character in string: ");
		String s = sc.next();
		sc.close();
		char a[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			a[i] = s.charAt(i);
		}
		for (int j = 0; j < s.length(); j++) {
			for (int k = j + 1; k < s.length(); k++) {
				if (a[j] == a[k]) {
					System.out.println(a[j]);
				}

			}
		}

	}
}
