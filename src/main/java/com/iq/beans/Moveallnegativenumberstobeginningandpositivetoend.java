package com.iq.beans;

import java.util.Arrays;

public class Moveallnegativenumberstobeginningandpositivetoend {
	public static void arraysort(int[] array) {
		Arrays.sort(array);
	}

	public static void main(String[] args) {
		int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };

		//arraysort(arr);

		Arrays.sort(arr);

		for (int a : arr) {
			System.out.print(a + " ");
		}

	}
}
