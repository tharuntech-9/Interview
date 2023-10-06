package com.iq.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Findallthewordsstartsandendswithsame {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("ab", "aba", "xyx", "pop", "jkl", "tht");
		List<Integer> asList2 = Arrays.asList(0, 1, 1, 1, 1, 0, 0, 0, 1, 0);
		asList.stream().filter(x -> x.length() > 0 && x.endsWith(String.valueOf(x.charAt(0))))
				.forEach(System.out::println);

		Map<Integer, Long> collect = asList2.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

		asList.stream().filter(x -> x.length() > 0 && x.endsWith(String.valueOf(x.charAt(0))))
				.forEach(System.out::println);
	}
}
