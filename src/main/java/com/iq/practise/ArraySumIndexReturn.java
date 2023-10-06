package com.iq.practise;

import java.util.HashMap;
import java.util.Map;

public class ArraySumIndexReturn {

	public static int[] twoindexreturn(int[] array,int target) {
		Map<Integer, Integer> map= new HashMap<>();
		
		for(int i=0; i < array.length ; i++) {
			int compliment = target - array[i];
			
			if(map.containsKey(compliment)) {
				return new int[] {map.get(compliment) , i};
			}
			map.put(array[i], i);
		}
		throw new IllegalArgumentException("no solution");
	}
	
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50,60};
		int[] twoindexreturn = twoindexreturn(array, 90);
		for(int two : twoindexreturn) {
			System.out.println(two);
		}
		
 	}
}
