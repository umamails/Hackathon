package com.hackathon;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// Q4.	Given an array of integers check the Palindrome of the series.
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter array size: ");
			int arraysize = sc.nextInt();
			int a[] = new int[arraysize];
			System.out.println("enter the array numbers:");
			for (int i = 0; i < arraysize; i++) {
				a[i] = sc.nextInt();
			}
			int flag=0;
			int n=arraysize;
			for(int i=0;i<n/2 && n!=0;i++) {
				if(a[i]!=a[(n-i-1)] ){
					flag=1;
					break;
					
				}
			}
			if(flag==1)
				System.out.println("not Palindrome");
			else
				System.out.println("Palindrome");
	}

}
