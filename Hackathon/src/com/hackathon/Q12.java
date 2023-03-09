package com.hackathon;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input string/number for palindrome checking: ");
		String s = sc.nextLine();
		sc.close();
		String r = "";
		boolean a = false;
	//	for (int i = s.length() - 1; i >= 0; i--) {
		for (int i=0;i<s.length();i++) {
			r = s.charAt(i)+r;
		}
		if (s.equals(r)) {
			System.out.println("the given input is  palindrome");
		} else {
			System.out.println("the given input is not palindrome");
		}
	}

}
