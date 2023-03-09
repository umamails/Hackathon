package com.hackathon;

import java.util.Scanner;

public class Q15uniqueword {

	public static void main(String[] args) {
		// Q15. Given a string print the unique words of the string.
		Scanner sc3 = new Scanner(System.in);
		System.out.println("enter the sentence: ");
		String s = sc3.nextLine();
		sc3.close();
		String a[] = s.split(" ");
		int b;
		for (int i = 0; i < a.length; i++) {
		b=1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equalsIgnoreCase(a[j])) {
					b++;
					a[j] = "";
				}

			}
			if (b == 1) {
				System.out.println(a[i]);
			}

		}
	}

}
