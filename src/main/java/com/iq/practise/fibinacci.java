package com.iq.practise;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fibinacci {

	public static int findingFibonacciSeries(int number) {

		if(number < 1) {
			System.out.println("please enter a valid number");
			return Integer.MIN_VALUE;
		}else if(number == 1) {
			return 0;
		}else if(number == 2) {
			return 1;
		}else {
			return findingFibonacciSeries(number - 1) + findingFibonacciSeries(number - 2); 
		}

	}

	public static void fibonacciUsingJava8(int series) {
		String collect = Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(series)
				.map(t -> t[0]).map(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(collect);

	}

	public static void sumOfnFibinacciSeries(int series) {

		int sum = Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(series).map(t -> t[0])
				.mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

	public static void main(String[] args) {
		int findingFibonacciSeries = findingFibonacciSeries(7);
		System.out.println("7 fibonacci series is " + findingFibonacciSeries);
		fibonacciUsingJava8(9);
		sumOfnFibinacciSeries(10);

	}

}
