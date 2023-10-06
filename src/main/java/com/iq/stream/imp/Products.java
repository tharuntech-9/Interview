package com.iq.stream.imp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Products {
	
	private int id;
	private String name;
	private String category;
	private double price;

}
