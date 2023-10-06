package com.iq.beans;

public class FindingCaptial {
	public static void main(String[] args) {

		String str = "How to Print Uppercase Letters in Java";
		
		for (int i = 0; i < str.length(); i++) {

			if (Character.isUpperCase(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (Character.isUpperCase(str.charAt(i))) {
				count++;
			}
		}

		System.out.println("no.of uppercase letters "+count);
	}

}
