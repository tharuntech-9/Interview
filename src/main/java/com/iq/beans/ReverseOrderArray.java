package com.iq.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseOrderArray {

	public void printingArrayInReverseOrder(int[] arr) {

		System.out.println("Original Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse Array");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		new ReverseOrderArray().printingArrayInReverseOrder(array);
		System.out.println();
		System.out.println("Using Java 8");
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 9, 8);
		Collections.reverse(asList);
		asList.forEach(num -> System.out.print(num + " "));
		// asList.stream().sorted(Comparator.reverseOrder()).forEach(x ->
		// System.out.print(x + " "));
		asList.stream().filter(num -> num % 2 == 0).forEach(even -> System.out.println("even number " + even));
		asList.stream().filter(num -> num % 2 != 0).forEach(odd -> System.out.println("odd number " + odd));

		List<Integer> collect = Arrays.stream(array).filter(e -> e != 1).boxed().collect(Collectors.toList());
		collect.forEach(System.out::println);

	}
}
