package com.iq.stream.imp;

import java.util.Arrays;
import java.util.List;

public class FindingEvenNumbers {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(11,12,13,14,16,99,87,86,76,56,42);
		numbers.stream().filter(num -> num%2==0).forEach(System.out::println);
	}
}
