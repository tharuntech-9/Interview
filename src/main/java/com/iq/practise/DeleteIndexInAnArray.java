package com.iq.practise;

import java.util.stream.IntStream;

public class DeleteIndexInAnArray {
	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 50, 550, 60, 70 };

		int[] array2 = IntStream.range(0, array.length).filter(removeindex -> removeindex != 5).map(x -> array[x])
				.toArray();
		for (int arr : array2) {
			System.out.print(arr + " ");
		}
	}
}
