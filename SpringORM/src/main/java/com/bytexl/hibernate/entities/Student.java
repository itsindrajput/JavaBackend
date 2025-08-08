package com.bytexl.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Student_Info")
public class Student {
	
	@Id
	@Column(name="std_id")
	private int stdId;
	@Column(name="std_name")
	private String name;
	@Column(name="std_course")
	private String course;
	@Column(name="std_city")
	private String city;
	
	public Student(int stdId, String name, String course, String city) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.course = course;
		this.city = city;
	}
	public Student() {
		super();
	}
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
