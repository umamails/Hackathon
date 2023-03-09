package com.hackathon;

import java.util.Scanner;

public class Q11split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		sc.close();
		String SArray[] = s.split(" ");
		for (int i = 0; i < SArray.length; i++) {
			System.out.println(SArray[i]);
		}

	}
}
