package com.iq.beans;

import java.util.PriorityQueue;

public class KthLargestElement2 {
	public int kthLargestElement(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for (int ar : arr) {
			minHeap.offer(ar);
			if (minHeap.size() > k) {
				minHeap.remove();
			}
		}
		return minHeap.remove();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7, 5, 3 };
		int kthLargestElement = new KthLargestElement2().kthLargestElement(arr, 1);
		System.out.println(kthLargestElement);

		PriorityQueue<Integer> integers = new PriorityQueue<Integer>();
		integers.add(7);
		integers.add(2);
		integers.add(3);
		integers.add(5);
		integers.add(4);
		integers.add(1);
		integers.add(6);
		System.out.println(integers);

	}
}
