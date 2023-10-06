package com.iq.stream.imp;

import java.util.Scanner;

public class FindPostiveNegativeZero {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter a number :");
		int number = scanner.nextInt();
		
		if(number > 0) {
			System.out.println("it is a postive number");
		}else if (number < 0) {
			System.out.println("it  is a negative number");
		}else if (number == 0) {
			System.out.println("you entered a zero");
		}
	}
}
