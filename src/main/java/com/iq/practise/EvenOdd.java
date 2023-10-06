package com.iq.practise;

public class EvenOdd {
	public void findingEvenOdd(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println(array[i] + " is a even number");
			} else {
				System.out.println(array[i] + " is a odd number");
			}
		}
	}

	public static void main(String[] args) {
		int[] array = {10,11,12,13,14,15,16,17};
		new EvenOdd().findingEvenOdd(array);
	}
}
