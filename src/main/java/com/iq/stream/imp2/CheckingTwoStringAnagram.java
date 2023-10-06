package com.iq.stream.imp2;

import java.util.Arrays;

public class CheckingTwoStringAnagram {

	public static void checkinAnagram(String string1, String string2) {
		if (string1.length() != string2.length()) {
			System.out.println(string1 + " " + string2 + " are not  anagram");
		}

		char[] charArray = string1.toCharArray();
		char[] charArray2 = string2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);

		boolean equals = Arrays.equals(charArray, charArray2);

		if (equals) {
			System.out.println(string1 + " " + string2 + " are anagram");
		} else {
			System.out.println(string1 + " " + string2 + " are not  anagram");
		}

	}

	public static void main(String[] args) {
		checkinAnagram("silent", "listen");

	}
}
