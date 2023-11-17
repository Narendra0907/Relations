package com.pojo;

import java.util.List;

public class Course {

	private Integer course_id;
	private List<String> course_name;
	private Integer course_duration;
	private Person person_course;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(Integer course_id, List<String> course_name, Integer course_duration, Person person_course) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_duration = course_duration;
		this.person_course = person_course;
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	public List<String> getCourse_name() {
		return course_name;
	}
	public void setCourse_name(List<String> course_name) {
		this.course_name = course_name;
	}
	public Integer getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(Integer course_duration) {
		this.course_duration = course_duration;
	}
	public Person getPerson_course() {
		return person_course;
	}
	public void setPerson_course(Person person_course) {
		this.person_course = person_course;
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", course_duration="
				+ course_duration + ", person_course=" + person_course + "]";
	}
	
}
