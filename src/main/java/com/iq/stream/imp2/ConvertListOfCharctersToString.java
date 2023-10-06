package com.iq.stream.imp2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfCharctersToString {
	public static void main(String[] args) {
		List<Character> chaList = Arrays.asList('t', 'h', 'a', 'r', 'u', 'n');

		String collect = chaList.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(collect);
	}
}
