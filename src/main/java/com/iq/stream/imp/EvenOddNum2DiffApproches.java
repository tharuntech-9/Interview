package com.iq.stream.imp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOddNum2DiffApproches {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> collect = integers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Numbers are " + collect);

		List<Integer> collect2 = integers.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
		System.out.println("odd numbers are " + collect2);

		Map<Boolean, List<Integer>> collect3 = integers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
		List<Integer> list = collect3.get(true);
		List<Integer> list2 = collect3.get(false);
		System.out.println(list);
		System.out.println(list2);
	}
}
