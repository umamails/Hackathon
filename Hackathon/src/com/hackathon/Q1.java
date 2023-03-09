package com.hackathon;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three Booleans: ");
		boolean a=sc.nextBoolean();
		boolean b=sc.nextBoolean();
		boolean c=sc.nextBoolean();
		sc.close();
		if(a&&b||b&&c||c&&a) {
			System.out.println("two of entered values are true");
		}else {
			System.out.println("two of entered values not true");
		}
	}

}

