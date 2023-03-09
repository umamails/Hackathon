package com.hackathon;

import java.util.Arrays;

public class Q26mergesortedarray {

	public static void main(String[] args) {
		// Q26. WJP to merge two sorted array.(Do not use third array)array1[10] =
		// 1,2,4,6,9,10 array2[4] = 3, 5,7,8
		// After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10
		int array1[] = { 1, 2, 4, 6, 9, 10 };
		int array2[] = { 3, 5, 7, 8 };
		int c = array1.length;
		int j = 0;
		array1 = Arrays.copyOf(array1, array1.length + array2.length);
		for (int i = c; i < array1.length; i++) {
			array1[i] = array2[j];
			j++;
		}
		Arrays.sort(array1);
		for (int i = 0; i < array1.length; i++)
			System.out.print(array1[i] + " ");
	}
}
