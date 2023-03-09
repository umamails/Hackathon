package com.hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Sortarrayq3 {

	public static void main(String[] args) {
		// given an array of intergers, sort the integer values
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
