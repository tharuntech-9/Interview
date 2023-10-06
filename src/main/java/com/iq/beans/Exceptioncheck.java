package com.iq.beans;

public class Exceptioncheck{
	public void check() {
		try {
			int a=3;
			int b=0;
			int c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			throw new CustomException("not found");
		}
	}
	
	public static void main(String[] args) {
		Exceptioncheck exceptioncheck=new Exceptioncheck();
		exceptioncheck.check();
	}
}
