package com.iq.stream.imp;

import java.util.Optional;

public class Optionalclasspractise {
	public static void main(String[] args) {
		String name= "";
		
		
		Optional<String> optional=Optional.of(name);
		
		if(optional.isPresent()) {
			System.out.println("the number is " + name);
		}else {
			String orElse = optional.orElse("default");
			System.out.println("the number is " + orElse);
		}
		
	}
}
