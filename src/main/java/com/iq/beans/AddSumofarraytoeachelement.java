package com.iq.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//first add sum of each array element
//then add sum + each element
//input : {10,20,30,40,50};
//sum = 150
//output : {160,170,180,190,200}
public class AddSumofarraytoeachelement {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(10, 20, 30, 40, 50);

		Integer sumofallelements = number.stream().reduce(0, Integer::sum);
		number.stream().map(eachelement -> eachelement + sumofallelements).collect(Collectors.toList())
				.forEach(x -> System.out.print(x + " "));
		System.out.println('\n');
		System.out.println(sumofallelements);
		// first convert all countries into uppercase and seperate them by ,
		List<String> countries = Arrays.asList("Usa", "japan", "india", "argentina", "poland", "newZealand");
		String collect2 = countries.stream().map(element -> element.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(collect2);

	}
}
