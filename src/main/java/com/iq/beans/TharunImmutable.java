package com.iq.beans;

public final class TharunImmutable {

	private final String skills;
	private final String highestQualification;
	private final AdditionalSkills additionalSkills;

	public TharunImmutable(String skill, String highestQualification, AdditionalSkills additionalSkills) {

		this.skills = skill;
		this.highestQualification = highestQualification;
		AdditionalSkills skills = new AdditionalSkills(additionalSkills.technicalSkills);
		this.additionalSkills = skills;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public String getSkills() {
		return skills;
	}

	public AdditionalSkills getAdditionalSkills() {
		return additionalSkills;
	}

	@Override
	public String toString() {
		return "TharunImmutable [skills=" + skills + ", highestQualification=" + highestQualification
				+ ", additionalSkills=" + additionalSkills + "]";
	}

	public static void main(String[] args) {
		AdditionalSkills additionalSkills = new AdditionalSkills("devops");
		TharunImmutable tharunImmutable = new TharunImmutable("Java Developer", "B.Tech", additionalSkills);
		System.out.println(tharunImmutable);
		additionalSkills.technicalSkills = "aws";
//		AdditionalSkills additionalSkills2 = tharunImmutable.getAdditionalSkills();
//		System.out.println(additionalSkills2.technicalSkills);
		System.out.println(tharunImmutable);
	}

}

class AdditionalSkills {

	String technicalSkills;

	public AdditionalSkills(String technicalSkills) {
		this.technicalSkills = technicalSkills;
	}

	@Override
	public String toString() {
		return "AdditionalSkills [technicalSkills=" + technicalSkills + "]";
	}

}
