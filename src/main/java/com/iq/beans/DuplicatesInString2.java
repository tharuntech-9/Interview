package com.iq.beans;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesInString2 {
	public static void main(String[] args) {
		String name = "tharun tharun going going to school";
		String name2 = "tharunkumarr";
		char[] charArray = name2.toCharArray();
		String[] split = name.split(" ");
		String collect = Stream.of(split).distinct().collect(Collectors.joining(" "));
		System.out.println(collect);
		long count = name2.chars().filter(l -> l == 'r').count();
		System.out.println(count);

		String[] split2 = name.split(" ");
		String collect2 = Stream.of(split).distinct().collect(Collectors.joining(" "));
		System.out.println(collect2);
		
		Stream.of(name.split(" ")).collect(Collectors.groupingBy(Function.identity() , Collectors.counting())).forEach( (key , value ) -> {
			if(value >= 2) {
				System.out.println(key + " " + value);
			}
		});
	}
}
