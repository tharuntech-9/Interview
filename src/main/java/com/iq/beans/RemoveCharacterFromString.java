
package com.iq.beans;

import java.util.stream.Stream;

public class RemoveCharacterFromString {
	public static void main(String[] args) {
		String string = "!Tharun!";
		String str = "hi welcome to the java program";
		String replaceAll = string.replaceAll("!", "");
		System.out.println(replaceAll);

		removeCharacter("!THARUN!", '!');

		long count = str.chars().filter(e -> e == 'e').count();
		System.out.println("count of e : " + count);

	}

	public static void removeCharacter(String string, char cha) {

		int length = string.length();
		String finalstring = "";

		for (int i = 0; i < length; i++) {
			if (string.charAt(i) != cha) {
				finalstring = finalstring + string.charAt(i);
			}
		}

		System.out.println(finalstring);

		Character[] arr = new Character[] { 'a', 'a', 'b', 'c', 'a', 'b', 'c', 'b', 'a', 'r', 'r', 'z', 'j' };
		Stream<Character> of = Stream.of(arr);
//		 Map<Character, Long> collect = of.map(ch -> ch)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		//of.map(x -> x).filter(x -> x.).collect(Collectors.toList()).forEach(System.out::println);
	}
}
