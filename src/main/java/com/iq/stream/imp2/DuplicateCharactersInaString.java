package com.iq.stream.imp2;

import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharactersInaString {
	public static void main(String[] args) {
		String name = "TharunKumar";
		
		name.chars().mapToObj(cha -> (char) cha)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((key, value) -> {
					if (value > 1) {
						System.out.println(key + " " + value);
					}
				});
	}
}