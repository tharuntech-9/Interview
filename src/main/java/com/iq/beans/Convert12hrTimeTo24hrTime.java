package com.iq.beans;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Convert12hrTimeTo24hrTime {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your time : ");
//		String next = scanner.next();
//		//dateFormat(next);
		convert12to24("05:29 PM");
	}
	public static void dateFormat(String string) {

		 LocalTime parse = LocalTime.parse(string, DateTimeFormatter.ISO_LOCAL_TIME);
		 System.out.println(parse);
	}
	
	public static void convert12to24(String inputTime) {
		
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime time = LocalTime.parse(inputTime, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String outputTime = outputFormatter.format(time);
        System.out.println(outputTime);
	}
	}


