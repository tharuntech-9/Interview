package com.iq.practise;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int number) {
		
		if(number <= 1) {
			return false;
		}
		
		for(int i=0; i<= number/2; i++ ) {
			if(number  % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your number :");
		int number = scanner.nextInt();
		if (isPrime(number)) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}

		for (int i = 2; i < 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}
}

//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
