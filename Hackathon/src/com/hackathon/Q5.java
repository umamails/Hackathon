package com.hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
	//Q5.	Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
Scanner sc=new Scanner(System.in);
System.out.println("enter the array value size: ");
int arraysize = sc.nextInt();
int a[] = new int[arraysize];
System.out.println("enter the array numbers: ");
for(int i=0;i<arraysize;i++) {
	a[i]=sc.nextInt();
}
Arrays.sort(a);
for(int i=0;i<arraysize;i++) {  // 2 3 2 2 4
	int count = 1;
	for(int j=i+1;j<arraysize;j++) {  
		
		if(a[i]==a[j]) {
			
			count++;
			System.out.println(a[j] +"duplicate occurrence is: " +count);
		}
		
			
		
	}
}
	}

}
