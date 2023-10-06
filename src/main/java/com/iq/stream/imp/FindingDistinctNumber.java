package com.iq.stream.imp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindingDistinctNumber {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,10,90,90,65,54,89,21);
	    numbers.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	    
	   // numbers.stream().filter(num -> !numbers.add(num)).collect(Collectors.toSet()).forEach(System.out::println);
		
	}
}
