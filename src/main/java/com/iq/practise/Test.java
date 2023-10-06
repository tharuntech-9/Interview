package com.iq.practise;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(10, "q");
		map.put(30, "w");
		map.put(20, "e");
		map.put(50, "r");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

		doubleMatrix();
	}

	private static void doubleMatrix() {
		int[][] array1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }; // 3*4
		int[][] array2 = { { 13, 14, 15 }, { 16, 17, 18 }, { 19, 20, 21 }, { 22, 23, 24 } }; // 4*3

		int[][] result = new int[3][3];

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {

				result[i][j] = 0;
				for (int k = 0; k < 4; k++) {
					result[i][j] += array1[i][k] * array2[k][j];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}
}
