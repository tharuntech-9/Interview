package com.iq.beans;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,6,7};
		missingNumberUsingJava8(array);
		int missingnumber= array.length+1;
		int sum = (missingnumber * (missingnumber+1))/2;
		
		for(int i=0;i<array.length;i++) {
			sum = sum - array[i];
		}
		System.out.println(sum);
	}

	public static void missingNumberUsingJava8(int[] array) {
		int maxvalue = Arrays.stream(array).max().getAsInt();
		System.out.println("maxvalue " + maxvalue);

		int excpectedsum = (maxvalue * (maxvalue + 1)) / 2;
		int sum = Arrays.stream(array).sum();
		System.out.println(sum);
		int missingnumber = excpectedsum - sum;
		System.out.println(missingnumber);

	}

}
