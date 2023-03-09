package com.hackathon;

import java.util.Scanner;

public class Q60 {
	// Q 60. write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers, the number will be  based on var k. Array = [3,2,4,7,0,3,1,5,8, 4]       k=3       OutPut = [4,2,3,3,0,7,8,5,1,4]
	public static void reverse(int[] array,int k ) {
		for(int i=0;i<array.length;i=i+k) {
			int start=i;
			int end=Math.min(i+k-1, array.length-1);
			while(start<=end) {
				int temp=array[start];
				array[start]=array[end];
				array[end]=temp;
				start++;
				end--;
				
			}
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size: ");
	int arraysize = sc.nextInt();
	int a[] = new int[arraysize];
	System.out.println("enter the array numbers:");
	for (int i = 0; i < arraysize; i++) {
		a[i] = sc.nextInt();

	}
	int k=3;
	reverse(a,k);
	for(int i:a) {     // for each loop
	System.out.print(i+ " ");	
	}
}
			}