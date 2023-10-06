package com.iq.beans;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
//java8
public class DeleteMoreOccurchar {
	Map<Character, Integer> map = new HashMap<Character, Integer>();

	public void remove(Character[] arr, int size, int deleteindex) {
		for (int i = 0; i < size; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		map.forEach((k, v) -> System.out.println("printing " + k + "  " + v));

//		Set<Entry<Character, Integer>> entrySet = map.entrySet();
//		Iterator<Entry<Character, Integer>> iterator = entrySet.iterator();
//
//		while (iterator.hasNext()) {
//			Entry<Character, Integer> next = iterator.next();
//			System.out.println(next);
//
//		}
	}

	public void removeIndex(Character[] arr, int size, int deleteindex) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < size; i++) {
			map.put(arr[i], i + 1);
			if (map.get(arr[i]) == deleteindex) {
				map.remove(arr[i]);
			}
		}
		map.forEach((k, v) -> System.out.print(k + " "));
	}

	public static void main(String[] args) {

		Character[] arr = new Character[] { 'a', 'a', 'b', 'c', 'a', 'b', 'c', 'b', 'a', 'r', 'r', 'z', 'j' };
		int size = arr.length;
		new DeleteMoreOccurchar().remove(arr, size, 3);

		Set<Character> set = new HashSet<Character>();
		for (char ar : arr) {
			set.add(ar);
		}
		set.stream().collect(Collectors.toSet()).forEach(x -> System.out.println(x));
		
		
		
		// new DeleteMoreOccurchar().removeIndex(arr, size, 1);

	}
}
