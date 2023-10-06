package com.iq.stream.imp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatTwoLists {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

		Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList())
				.forEach(x -> System.out.print(x + " "));

		System.out.println('\n' + "------------------");

		Stream.concat(list1.stream(), list2.stream()).distinct().forEach(x -> System.out.print(x + " "));

		System.out.println('\n' + "------------------");

		Integer integer = Stream.concat(list1.stream(), list2.stream()).max((x1, x2) -> x1 - x2).get();
		System.out.println(integer);

	}
}
