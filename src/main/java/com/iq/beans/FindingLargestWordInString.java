package com.iq.beans;

import java.util.Comparator;
import java.util.stream.Stream;

public class FindingLargestWordInString {
	public static void main(String[] args) {

		String name = "welcome to java programing world";
		String findingLargestWordUsingForLoop = findingLargestWordUsingForLoop(name);
		System.out.println(findingLargestWordUsingForLoop);

		String findingLargestWordUsingStreams = findingLargestWordUsingStreams(name);
		System.out.println(findingLargestWordUsingStreams);
	}

	public static String findingLargestWordUsingForLoop(String Str) {
		String[] word = Str.split(" ");
		String largestword = "";

		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > largestword.length()) {
				largestword = word[i];
			}
		}
		return largestword;
	}

	public static String findingLargestWordUsingStreams(String Str) {

		String string = Stream.of(Str.split(" ")).max(Comparator.comparing(String::length)).get();
		return string;

	}

}
