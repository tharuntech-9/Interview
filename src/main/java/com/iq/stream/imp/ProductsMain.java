package com.iq.stream.imp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductsMain {
	public static void main(String[] args) {
		Products products1 = new Products(1, "JAVA", "Books", 999);
		Products products2 = new Products(2, "DEVOPS", "Books", 599);
		Products products3 = new Products(3, "AWS", "Books", 499);
		Products products4 = new Products(4, "C++", "Books", 399);
		Products products5 = new Products(5, "NET", "Books", 399);
		Products products6 = new Products(6, "TV", "Electronics", 19999);
		Products products7 = new Products(7, "AC", "Electronics", 30999);
		Products products8 = new Products(8, "PLAYSTATION", "Electronics", 99999);
		Products products9 = new Products(9, "LAPTOP", "Electronics", 89999);

		List<Products> products = Arrays.asList(products1, products2, products3, products4, products5, products6,
				products7, products8, products9);
		products.stream().filter(product -> product.getCategory().equalsIgnoreCase("books") & product.getPrice() > 599)
				.collect(Collectors.toList()).forEach(System.out::println);

		Map<String, Long> collect = products.stream()
				.collect(Collectors.groupingBy(Products::getCategory, Collectors.counting()));
		System.out.println(collect);

		Map<String, Products> collect5 = products.stream()
				.collect(Collectors.groupingBy(Products::getCategory, Collectors.collectingAndThen(
						Collectors.maxBy(Comparator.comparing(product -> product.getPrice())), Optional::get)));

		System.out.println("higest price in book and electronics category : \n " + collect5);

		Double collect3 = products.stream().filter(product -> product.getCategory().equalsIgnoreCase("books"))
				.collect(Collectors.averagingDouble(Products::getPrice));

		System.out.println(collect3);
		List<String> product1 = Arrays.asList("JAVA", "AWS");
		List<Products> collect4 = products.stream().filter(
				product -> product.getName().equalsIgnoreCase("java") & product.getName().equalsIgnoreCase("AWS"))
				.collect(Collectors.toList());
		
		
	
		System.out.println(collect4);

	}
}
