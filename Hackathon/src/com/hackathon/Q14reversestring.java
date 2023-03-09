package com.hackathon;

import java.util.Scanner;

public class Q14reversestring {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the String to reverse: ");
		String s1 = sc1.nextLine();
		String s2[]=s1.split(" ");
		String a = " ";
		sc1.close();
		for (int i = 0; i < s2.length; i++) {
			a=s2[i]+" "+a;
			
			
		}
		System.out.println("Reversed String is: " +a);
	}

}
