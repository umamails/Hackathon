package com.hackathon;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Q2.	write a program to find factorial (Non Recursive)
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the factorial no: ");
		int n = sc.nextInt();
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		System.out.println("Factorial of " + n + " is :" + sum);
		sc.close();
	}

}
