package com.iq.beans;

public class Fibonacci2 {
	static int number1 = 0;
	static int number2 = 1;
	static int sum = 0;

	public static void fibonacci(int num) {

		if (num > 2) {
			sum = number1 + number2;
			System.out.print(sum + " ");
			number1 = number2;
			number2 = sum;

			fibonacci(num - 1);

		}

	}

	public static void main(String[] args) {
//		int number1 = 0;
//		int number2 = 1;
//		int sum = 0;
//
//		System.out.print(number1 + " " + number2);
//
//		for (int i = 2; i < 10; i++) {
//			sum = number1 + number2;
//			System.out.print(" " + sum);
//			number1 = number2;
//			number2 = sum;
//		}

		System.out.print(number1 + " " + number2 + " ");
		fibonacci(10);

	}

}
