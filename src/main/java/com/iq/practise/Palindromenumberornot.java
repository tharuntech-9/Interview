package com.iq.practise;

import java.util.Scanner;

public class Palindromenumberornot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter your number :");
		int originalnumber = scanner.nextInt();
		int temp = originalnumber;
		int reversenumber = 0;

		while (originalnumber > 0) {
			reversenumber = reversenumber * 10 + originalnumber % 10;
			originalnumber = originalnumber / 10;
		}

		if (temp == reversenumber) {
			System.out.println(temp + " is a palindrome number");
		} else {
			System.out.println(temp + " not a palindrome number");
		}

	}
}
