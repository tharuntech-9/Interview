package com.iq.beans;

public class Fibonacci {

	public int calculateFibonacci(int n) {

		if (n < 1) {
			System.out.println("PLEASE ENTER A POSTIVE NUMBER..,");
			return Integer.MIN_VALUE;
		} else if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		System.out.println("5th Fibonacci is --->" + fibonacci.calculateFibonacci(5));
		System.out.println("6th Fibonacci is --->" + fibonacci.calculateFibonacci(6));
	}
}