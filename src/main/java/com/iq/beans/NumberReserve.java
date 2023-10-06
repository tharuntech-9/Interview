package com.iq.beans;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberReserve {

	public int reverse(int input) {

		int reversed = 0;
		while (input != 0) {
			reversed = reversed * 10 + input % 10;
			input = input / 10;

		}
		return reversed;
	}

	public static void main(String[] args) {
		int res = new NumberReserve().reverse(654321);
		System.out.println(res);
		
		Stream<Integer> of = Stream.of(1,2,3,4,5,6);
		List<Integer> collect = of.collect(Collectors.toList());
		Collections.reverse(collect);
		System.out.println(collect);
		

	}
}
