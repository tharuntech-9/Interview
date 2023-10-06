package com.iq.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {
	public void reverseOrder(String name) {
		char[] ch=name.toCharArray();
		List<Character> charactersList=new ArrayList<Character>();
		for(char c:ch) {
			charactersList.add(c);
		}
		Collections.reverse(charactersList);
		charactersList.forEach(character -> System.out.print(character + " "));
		
	}
	
	
	
	public static void main(String[] args) {
		new ReverseOrder().reverseOrder("tharunkumar");
		
		
	}
}
