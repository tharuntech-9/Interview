package com.iq.practise;

public class MissingNumber {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 8 };
		int length = numbers.length + 1;
		int sum = (length * (length + 1)) / 2;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum - numbers[i];
		}

		System.out.println("missing number is " + sum);
	}
}
