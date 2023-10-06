package com.iq.stream.imp;

import java.util.Arrays;
import java.util.List;

public class NumDivisibleBy2WithoutFilter {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(2, 4, 5, 6, 8);

		// it returns true when all numbers are divisbile by 2 only
		boolean allMatch = integers.stream().allMatch(num -> num % 2 == 0);

		// if atleast one number is divisble by 2 then it returns true
		boolean anyMatch = integers.stream().anyMatch(num -> num % 2 == 0);

		if (allMatch) {
			System.out.println("All numbers are divisible by 2");
		} else {
			System.out.println("all numbers are not divisible by 2");
		}
	}
}
