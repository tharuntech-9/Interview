package com.iq.beans;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciseriesJava8 {

	public static void main(String[] args) {
		generateFibbonaciSeries(8);
		sumOfNFibonacciSeries(10);
	}

	public static void generateFibbonaciSeries(int series) {
		String collect2 = Stream.iterate(new int[] {0,1} , t -> new int[] {t[1], t[1] + t[0]} ).limit(series).map(t -> t[0]).map(String::valueOf)
		.collect(Collectors.joining(", "));
		System.out.println(collect2);
		
	}

	public static void sumOfNFibonacciSeries(int series) {
		int sum = Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(series).map(x -> x[0])
				.mapToInt(Integer::intValue).sum();
		System.out.println("sum of " + series + " fibonacci series is : " + sum);

	}
	
//	String collect = Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] }).limit(series)
//			.map(t -> t[0]).map(String::valueOf).collect(Collectors.joining(","));
//
//	System.out.println(collect);


}
