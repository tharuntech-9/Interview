package com.iq.stream.imp2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindingFrequencyOfWordsInList {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "AA", "BB", "cc", "DD");

		Map<String, Long> collect = list.stream().filter(eachword -> Collections.frequency(list, eachword) >= 2)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(collect);
	}
}
