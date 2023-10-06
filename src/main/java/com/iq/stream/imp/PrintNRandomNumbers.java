package com.iq.stream.imp;

import java.util.Random;
import java.util.Scanner;

//Take an input number N from user and generate N random numbers between 10 to 99
public class PrintNRandomNumbers {
	public static void main(String[] args) {
		System.out.print("Enter how many numbers want to print : ");
		Scanner scanner=new Scanner(System.in);
		int nextInt = scanner.nextInt();
		Random random=new Random();
		random.ints(nextInt, 10, 99).forEach(System.out::println);
		
	}
}
