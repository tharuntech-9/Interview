package com.iq.beans;

public class ForBreakCheck {

	public void print() {
		for (int i = 0; true; i++) {

			if (i == 5) {
				System.out.println("printing i=" + i);
				continue;
			}

			if (i == 6)
				break;
			System.out.println("hello " + i);

		}

	}

	public static void main(String[] args) {
		new ForBreakCheck().print();
	}
}
