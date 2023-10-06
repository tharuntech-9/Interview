package com.iq.beans;

import java.util.Scanner;

public class PrimeNumbers {

	public static boolean isprime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your number : ");
		int number = scanner.nextInt();

		if (isprime(number)) {
			System.out.println(number + " is a prime number ");
		} else {
			System.out.println(number + " not a prime number ");
		}

		for (int i = 2; i <= 100; i++) {
			if (isprime(i)) {
				System.out.println(i + " is a primenumber");
			}
		}
	}

}
