package com.iq.beans;

import java.sql.Date;

import lombok.ToString;

@ToString
public final class Immutable {

	private final String name;
	private final int id;
	private final Date dob;

	public Immutable(String name, int id, Date dob) {
		this.name = name;
		this.id = id;
		this.dob = dob;
	}

	public Date getDob() {
		return new Date(dob.getTime());
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		Immutable immutable = new Immutable("tharun", 111, new Date(10));
		System.out.println(immutable);

		immutable.getDob().setTime(21);

		System.out.println(immutable);
	}

}
