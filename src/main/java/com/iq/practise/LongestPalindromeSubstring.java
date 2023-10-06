package com.iq.practise;

public class LongestPalindromeSubstring {

	public static String longestPalindrome(String string) {

		String lps = "";
		int length = string.length();

		for (int i = 0; i < length; i++) {
			String odd = expandPalindrome(string, i, i);
			String even = expandPalindrome(string, i, i + 1);

			if (lps.length() < odd.length()) {
				lps = odd;
			}

			if (lps.length() < even.length()) {
				lps = even;
			}

		}
		return lps;
	}

	public static String expandPalindrome(String string, int left, int right) {

		while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right)) {
			left--;
			right++;
		}
		return string.substring(left + 1, right);
	}

	public static void main(String[] args) {
		String name = "racecar09";
		String longestPalindrome = longestPalindrome(name);
		System.out.println(longestPalindrome);
	}
}
