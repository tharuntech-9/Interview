package com.iq.beans;

import java.util.PriorityQueue;

public class KthLargestElement {
	private final PriorityQueue<Integer> minHeap;
	private final int k;
	public KthLargestElement(int k,int[] arr) {
		this.k = k;
		minHeap=new PriorityQueue<>();
		for(Integer ar:arr) {
			add(ar);	
		}
	}
	
	public int add(int val) {
		minHeap.add(val);
		if(minHeap.size()>k) {
			minHeap.poll();
		}
		return minHeap.peek();
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		KthLargestElement kthLargestElement = new KthLargestElement(2, arr);
		
		System.out.println(kthLargestElement.add(2));
	}
	
}
