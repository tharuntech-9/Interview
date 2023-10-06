package com.iq.practise;

public final class Immutable {

	private final String name;
	private final String qualification;
	private final MyImmutable immutable;

	public Immutable(String name, String qualification, MyImmutable immutable) {
		this.name = name;
		this.qualification = qualification;
		//this.immutable = immutable;
		MyImmutable immutable2 = new MyImmutable(immutable.skills);
		this.immutable = immutable2;
	}

	public String getName() {
		return name;
	}

	public String getQualification() {
		return qualification;
	}

	public static void main(String[] args) {
		MyImmutable myImmutable = new MyImmutable("java");
		Immutable immutable = new Immutable("tharun", "B.tech", myImmutable);

		System.out.println(immutable.getImmutable().skills);

		myImmutable.skills = "python";

		System.out.println(immutable.getImmutable().skills);
	}

	@Override
	public String toString() {
		return "Immutable [name=" + name + ", qualification=" + qualification + ", immutable=" + immutable + "]";
	}

	public MyImmutable getImmutable() {
		return immutable;
	}

}

class MyImmutable {

	String skills;

	public MyImmutable(String skills) {
		this.skills = skills;
	}

}