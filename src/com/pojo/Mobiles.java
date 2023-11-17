package com.pojo;

import java.util.List;

public class Mobiles {

	private Integer mobile_id;
	private Long mobile_number;
	private List<String> mobile_sim;
	private Person person_mobiles;
	public Integer getMobile_id() {
		return mobile_id;
	}
	@Override
	public String toString() {
		return "Mobiles [mobile_id=" + mobile_id + ", mobile_number=" + mobile_number + ", mobile_sim=" + mobile_sim
				+ ", person_mobiles=" + person_mobiles + "]";
	}
	public void setMobile_id(Integer mobile_id) {
		this.mobile_id = mobile_id;
	}
	public Long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(Long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public List<String> getMobile_sim() {
		return mobile_sim;
	}
	public void setMobile_sim(List<String> mobile_sim) {
		this.mobile_sim = mobile_sim;
	}
	public Person getPerson_mobiles() {
		return person_mobiles;
	}
	public void setPerson_mobiles(Person person_mobiles) {
		this.person_mobiles = person_mobiles;
	}
	
}
