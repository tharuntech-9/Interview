package com.iq.stream.imp2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseeachwordsinastringusingstream {
	public static void main(String[] args) {
		String name = "quick brown fox jumps over lazy dog";

		String reversename = Arrays.stream(name.split(" ")).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));
		
		System.out.println("original : " + name);
		System.out.println("reversed : " + reversename);
	}
}
