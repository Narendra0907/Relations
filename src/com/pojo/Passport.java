package com.pojo;

public class Passport {

	private Integer passport_id;
	private String passport_number;
	private Person person_passport;
	@Override
	public String toString() {
		return "Passport [passport_id=" + passport_id + ", passport_number=" + passport_number + ", person_passport="
				+ person_passport + "]";
	}
	public Passport(Integer passport_id, String passport_number, Person person_passport) {
		super();
		this.passport_id = passport_id;
		this.passport_number = passport_number;
		this.person_passport = person_passport;
	}
	
	public Integer getPassport_id() {
		return passport_id;
	}
	public void setPassport_id(Integer passport_id) {
		this.passport_id = passport_id;
	}
	public String getPassport_number() {
		return passport_number;
	}
	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}
	public Person getPerson_passport() {
		return person_passport;
	}
	public void setPerson_passport(Person person_passport) {
		this.person_passport = person_passport;
	}
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
