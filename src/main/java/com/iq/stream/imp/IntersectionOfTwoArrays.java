package com.iq.stream.imp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//given two integer arrays firstArray and secondArray,return an array of their intersection (means common element).
//input : int firstArray[] ={9,7,6,5};
//        int secondArray[]={5,6,1,2,4,3};
//output : {5,6}
public class IntersectionOfTwoArrays {
	public static void main(String[] args) {
		int firstArray[] = { 9, 7, 6, 5 };
		int secondArray[] = { 5, 6, 1, 2, 4, 3 };

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4);

		Arrays.stream(firstArray).filter(y -> Arrays.stream(secondArray).anyMatch(x -> y == x))
				.forEach(System.out::println);
	}
}
