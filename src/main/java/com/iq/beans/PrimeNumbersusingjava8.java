package com.iq.beans;

import java.util.stream.IntStream;

public class PrimeNumbersusingjava8 {
	public static void main(String[] args) {
		IntStream.range(2, 100).filter(PrimeNumbersusingjava8::isPrime).forEach(x -> System.out.print(x + " "));
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
