package com.hackathon;

import java.util.Scanner;

public class Q28 {
	// Q28. WJP to find factorial of a number using recursion
	public static int factorial(int a)
	{
		if(a>=1)
		{
			return a*factorial(a-1);
		}else
			return 1;
	}
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the factorial no: ");
		 a=sc.nextInt();
		 int fact=factorial(a);
		System.out.println(" factorial of number is : "+fact);
		
			
		}

	}


