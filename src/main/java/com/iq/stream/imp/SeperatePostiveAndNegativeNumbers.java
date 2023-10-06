package com.iq.stream.imp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeperatePostiveAndNegativeNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, -6, -7, -8, -9);
		numbers.stream().filter(num -> num > 0).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("negative numbers");
		numbers.stream().filter(num -> num < 0).collect(Collectors.toList()).forEach(System.out::println);
	}
}
