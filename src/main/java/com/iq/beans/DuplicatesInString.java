package com.iq.beans;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicatesInString {

	public void duplicates(String name) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = name.toCharArray();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				
				System.out.println(entry.getKey() + "  " + entry.getValue());

			}

		}
		

	}
	
	public void dupilicate(String name) {
		Set<Character> characters=new HashSet<Character>();
		long count = name.chars().filter(ch -> ch == 'a').count();
		System.out.println(count);
		  char[] charArray = name.toCharArray();
		for(char character:charArray) {
			characters.add(character);
		}
		Set<Character> collect = characters.stream().collect(Collectors.toSet());
		System.out.println("collect " + collect);
	}

	public static void main(String[] args) {
		new DuplicatesInString().duplicates("TharunKumar");
		new DuplicatesInString().dupilicate("TharunKumar");
	}

}
