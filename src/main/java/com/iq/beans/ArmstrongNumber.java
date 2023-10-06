package com.iq.beans;

import java.util.Scanner;

/*An Armstrong number is one whose sum of digits raised to the power three equals the number itself. 371, 
for example, is an Armstrong number because 3**3 + 7**3 + 1**3 = 371.*/

/* For example Armstrong numbers are : 0, 1, 153, 370, 371, 407, 1634, 8208, and 9474 */
public class ArmstrongNumber {
	public static void main(String[] args) {
		printingAmstrongNumber();
		printingArmstrongNumber2();
		pa();
		System.out.println('\n');
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = scanner.nextInt();
		// int number = 153;
		int temp = n;
		int cube;
		int sum = 0;
		while (n > 0) {
			cube = n % 10;
			n = n / 10;
			sum += Math.pow(cube, 3);
		}

		if (temp == sum) {
			System.out.println("it is an armstrong number");
		} else {
			System.out.println("it is not an armstrong number");
		}

	}

	public static void printingAmstrongNumber() {
		int cube;
		int sum = 0;

		for (int i = 0; i <= 10000; i++) {
			int temp = i;
			while (temp > 0) {
				cube = temp % 10;
				temp = temp / 10;
				sum += Math.pow(cube, 3);
			}
			if (i == sum) {
				System.out.println(sum + " is a Amstrong number");
			}
			sum = 0;
		}
	}

	public static void printingArmstrongNumber2() {
		for (int i = 1000; i < 10000; i++) {
			int sum = 0;
			int num = i;
			while (num > 0) {
				int digit = num % 10;
				sum += Math.pow(digit, 4);
				num = num / 10;
			}
			if (sum == i) {
				System.out.print(i + " ");
			}
		sum=0;
		}
	}
	
	public static void pa() {
		int sum =0;
		int cube;
		for(int i=0; i<=1000;i++) {
			int temp = i;
			while(temp > 0) {
				cube = temp % 10;
				temp = temp / 10;
				sum += Math.pow(cube, 3);
			}
			if(i == sum) {
				System.out.println("is a armstrong number " + sum);
			}
			sum =0;
			
		}
	}

}
