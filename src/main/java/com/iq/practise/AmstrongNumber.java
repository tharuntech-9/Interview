package com.iq.practise;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		//findingArmstrongNumber();
		armStrongNumber(153);
		armstrong();
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter your number : ");
		int originalnumber = scanner.nextInt();
		int temp = originalnumber;

		int cube;
		int sum = 0;

		while (temp > 0) {
			cube = temp % 10;
			temp /= 10;
			sum += Math.pow(cube, 3);
		}

		if (originalnumber == sum) {
			System.out.println(sum + " is a armstrong number");
		}
	}

	public static void findingArmstrongNumber() {
		int cube;
		int sum = 0;

		for (int i = 0; i <= 1000; i++) {
			int temp = i;
			while (temp > 0) {
				cube = temp % 10;
				temp = temp / 10;
				sum += Math.pow(cube, 3);
			}
			if(sum == i) {
				System.out.println(sum + " is a Armstrong number");
			}
			sum = 0;
		}
		
		
	}
	
	
	public static void armStrongNumber(int number) {
		int num = number;
		int cube;
		int sum =0;
		
		while(num > 0) {
			cube = num  % 10;
			num = num / 10;
			sum += Math.pow(cube,3);
			//sum = sum + cube * cube * cube;
		}
		
		if(number == sum) {
			System.out.println(sum + " is a Armstrong Number");
		}else {
			System.out.println(number + " not a Armstrong Number");
		}
	}
	
	public static void armstrong() {
		int cube;
		int sum =0;
		
		for(int i =0; i<=1000;i++) {
			int temp = i;
			
			while(temp > 0) {
				cube = temp % 10;
				temp = temp / 10;
				sum += Math.pow(cube, 3);
				
			}
			if(sum == i) {
				System.out.println(sum + " is a Armstrong Number");
			}
			
			sum =0;
		}
	}
}
