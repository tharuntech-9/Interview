package com.iq.practise;

import java.util.ArrayList;

public class RemoveWithoutSET {
public static void main(String[] args) {
	ArrayList<String> arrayList=new ArrayList<String>();
	arrayList.add("dhoni");
	arrayList.add("kohili");
	arrayList.add("shewag");
	arrayList.add("dhoni");
	arrayList.add("kohili");
	arrayList.add("raina");
	arrayList.add("sachin");
	System.out.println("before removing elements From list : " + arrayList);
	
	for(int i=0; i < arrayList.size(); i++) {
		for(int j = i+1; j < arrayList.size(); j ++) {
			if (arrayList.get(i) == arrayList.get(j)) {
				arrayList.remove(j);
			}
		}
	}
	
	System.out.println("after removing elements without using set : " + arrayList);
	
}
}
