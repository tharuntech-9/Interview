package com.iq.stream.imp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("i","have","a","sentense","with","technical","words");
		
		Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
		
	}
}
