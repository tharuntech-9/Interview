package com.iq.beans;

import java.util.stream.IntStream;

public class DeleteIndexInAnArray {

	public int[] removeIndex(int[] arr, int removeIndex) {
		return IntStream.range(0, arr.length).filter(index -> index != removeIndex).map(x -> arr[x]).toArray();
	}

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 550, 50, 60 };
		DeleteIndexInAnArray deleteIndexInAnArray = new DeleteIndexInAnArray();
		int[] removeIndex = deleteIndexInAnArray.removeIndex(array, 4);
		for (int remove : removeIndex) {
			System.out.print(remove + " ");
		}
		
		int[] array2 = IntStream.range(0, array.length).filter(index -> index != 4).map(x -> array[x]).toArray();
	}
}
