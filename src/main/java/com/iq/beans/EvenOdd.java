package com.iq.beans;

public class EvenOdd {
	public void oddandeven(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("even is: " + arr[i]);
			} else {
				System.out.println("odd is: " + arr[i]);
			}

		}

	}

	public static void main(String[] args) {
		new EvenOdd().oddandeven(new int[] { 10, 10, 12, 13, 14, 15 });
		int a = 100;
		int b = 6;
		int n = a % b;
		System.out.println(n);
	}
}
