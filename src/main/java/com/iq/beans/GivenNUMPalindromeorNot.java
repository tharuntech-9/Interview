
package com.iq.beans;

import java.util.Scanner;

//palindrome number = it remains same when we reverse the number also
//eg : input : 121  output : palindrome
//     input : 234  output : notpalindrome
public class GivenNUMPalindromeorNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int number = scanner.nextInt();
		int originalnumber = number;
		int reversenumber = 0;
		while (number != 0) {
			int num = number % 10;
			reversenumber = reversenumber * 10 + num;
			number = number / 10;
		}

		if (originalnumber == reversenumber) {
			System.out.println("it's a palindrone number ");
		} else {
			System.out.println("it's not a palindrone number ");
		}

	}
}
