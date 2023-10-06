package com.iq.beans;

public class WrapperClass {
	public static void main(String[] args) {
		Integer integer=Integer.valueOf(99);
		System.out.println(integer);
		
		Integer integer2=Integer.valueOf("999");
		System.out.println(integer2);
		
		Integer integer3=Integer.valueOf("1000", 2);
		System.out.println(integer3);
		
		Boolean boolean1=Boolean.valueOf("TRUEq");
		System.out.println(boolean1);
		
		Integer integer4 = new Integer(1000);
		byte byteValue = integer4.byteValue();
		System.out.println(byteValue);
		System.out.println(integer4.floatValue());
		
		Integer integer5=Integer.parseInt("100");
		System.out.println(integer5);
		
		String string=Integer.toString(0);
		System.out.println(string);
	}

}
