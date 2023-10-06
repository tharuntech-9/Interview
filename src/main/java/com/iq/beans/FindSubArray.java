package com.iq.beans;

public class FindSubArray {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };

		int count = 0;

		int sum = 0;

		int k = 3;

		for (int i = 0; i <= arr1.length-1 ; i++) {
			sum = sum + arr1[i];
			count++;
			if (sum == k)

			{
				break;
			}

		}
		System.out.println("the numbers of subarray thats sums " + k + " is " + count);
	}
}
