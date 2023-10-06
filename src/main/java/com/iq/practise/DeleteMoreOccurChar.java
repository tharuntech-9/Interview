package com.iq.practise;

import java.util.HashMap;
import java.util.Map;

public class DeleteMoreOccurChar {
	public void findingchars(char[] array,int size) {
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0; i<size ; i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i])+1);
			}else {
				map.put(array[i], 1);
			}
		}
		map.forEach((key , value) -> System.out.println(key + " " + value));
	}
	
	
	public static void main(String[] args) {
		char[] array = {'a','a','a','s','g','h','l','k','b','v'};
		int size=array.length;
		new DeleteMoreOccurChar().findingchars(array, size);
	}
}
