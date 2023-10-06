package com.iq.practise;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("enter your number : ");
		int palindromeNumber = scanner.nextInt();
		int temp = palindromeNumber;
		int reversednumber = 0;

		while (temp != 0) {
			int lastnumber = temp % 10;
			reversednumber = reversednumber * 10 + lastnumber;
			temp = temp / 10;
		}

		if (palindromeNumber == reversednumber) {
			System.out.println(palindromeNumber + " is a palindrome number ");
		} else {
			System.out.println(palindromeNumber + " not a palindrome number");
		}

	}
}
