package com.pojo;

import java.util.List;

public class Person {

	private Integer person_id;
	private String  person_name;
	private Integer  person_age;
	private Passport passport;
	private List<Mobiles> mobiles;
	public Integer getPerson_id() {
		return person_id;
	}
	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public Integer getPerson_age() {
		return person_age;
	}
	public void setPerson_age(Integer person_age) {
		this.person_age = person_age;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public List<Mobiles> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<Mobiles> mobiles) {
		this.mobiles = mobiles;
	}
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", person_name=" + person_name + ", person_age=" + person_age
				+ ", passport=" + passport + ", mobiles=" + mobiles + "]";
	}
}
