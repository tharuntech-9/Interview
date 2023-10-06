package com.iq.stream.imp;

import java.util.Scanner;

public class FindSumOfAllDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number : ");
		int number = scanner.nextInt();
		int remainder;
		int sum = 0;
		while (number > 0) {
			remainder = number % 10;
			sum = sum + remainder;
			number = number / 10;
		}
		
		System.out.println(sum);

	}

}
