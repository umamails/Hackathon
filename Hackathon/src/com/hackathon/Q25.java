package com.hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
//Write a program for binary search. And 5 i/p has to take from user as binary elements.
		Scanner s = new Scanner(System.in);
		System.out.println("enter the array size :");
		int arraysize = s.nextInt();
		int a[] = new int[arraysize];
		System.out.println("enter the array numbers:");
		for (int i = 0; i < arraysize; i++) {
			a[i] = s.nextInt();

		}
		Arrays.sort(a);
		for (int j = 0; j < arraysize; j++) {
			System.out.println(a[j]);

			s.close();
			
	}
	}
}


