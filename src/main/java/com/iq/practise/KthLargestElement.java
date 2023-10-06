package com.iq.practise;

import java.util.PriorityQueue;

public class KthLargestElement {

	public static int klargestnumber(int[] array, int k) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

		for (int arr : array) {
			priorityQueue.offer(arr);

			if (priorityQueue.size() > k) {
				priorityQueue.remove();
			}
		}
		return priorityQueue.remove();
	}

	public static void main(String[] args) {
		int[] array = { 10, 20, 30, 40, 55, 60 };
		int klargestnumber = klargestnumber(array, 2);
		System.out.println(klargestnumber);
	}
}
