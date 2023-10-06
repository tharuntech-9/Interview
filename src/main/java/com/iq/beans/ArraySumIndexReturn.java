package com.iq.beans;

import java.util.HashMap;
import java.util.Map;

public class ArraySumIndexReturn {

	public int[] twoSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int compliment = target - arr[i];

			if (map.containsKey(compliment)) {
				return new int[] { map.get(compliment), i };
			}
			map.put(arr[i], i);
		}
		throw new IllegalArgumentException("no two sum solution");
		// return new int[] {};
	}

	public static void main(String[] args) {
		int[] arr = { 2, 6, 1, 2, 5, 6 };
		ArraySumIndexReturn arraySumIndexReturn = new ArraySumIndexReturn();
		int[] findIndexForTargetSum = arraySumIndexReturn.twoSum(arr, 12);
		for (int i = 0; i < findIndexForTargetSum.length; i++) {
			System.out.println("printing index for sum : " + findIndexForTargetSum[i]);
		}
	}
}
