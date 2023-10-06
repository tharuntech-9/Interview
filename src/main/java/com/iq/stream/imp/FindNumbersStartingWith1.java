package com.iq.stream.imp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersStartingWith1 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(10, 11, 23, 43, 54, 12);
		List<String> strings = Arrays.asList("tharun", "teja", "pavan");

		integers.stream().map(num -> num + " ").filter(num -> num.startsWith("1")).collect(Collectors.toList())
				.forEach(System.out::println);

		strings.stream().filter(name -> name.startsWith("t")).collect(Collectors.toList()).forEach(System.out::println);

	}
}
