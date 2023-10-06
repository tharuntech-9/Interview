package com.iq.beans;

public class LongestPalindromesubstring {
	public static String longestPalindrome(String s) {

		String lps = "";
		int n = s.length();

		for (int i = 0; i < n; i++) {
			String odd = expandPalindrome(s, i, i);
			String even = expandPalindrome(s, i, i + 1);

			if (lps.length() < odd.length()) {

				lps = odd;

			}

			if (lps.length() < even.length()) {

				lps = even;

			}
		}

		return lps;

	}

	public static String expandPalindrome(String s, int l, int r) {
		while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
			l--;
			r++;
		}
		return s.substring(l + 1, r);
	}

	public static void main(String[] args) {
		LongestPalindromesubstring palindromesubstring = new LongestPalindromesubstring();
//		Scanner s = new Scanner(System.in);
//		System.out.print("enter your palindrome string : ");
//		String next = s.next();
		String name = "racecar09";
		String longestPalindrome =longestPalindrome(name);
		//String longestPalindrome = palindromesubstring.longestPalindrome(name);
		System.out.println(longestPalindrome);
	}
}
