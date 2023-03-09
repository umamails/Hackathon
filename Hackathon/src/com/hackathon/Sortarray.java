package com.hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Sortarray {

	public static void main(String[] args) {
		// given an array of intergers, sort the integer values
		int a[] = {3,6,1,2,0};
		System.out.println("list of array numbers are:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		Arrays.sort(a);
		System.out.println("\nsorted array: ");
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] +" ");
		}

	}
}
