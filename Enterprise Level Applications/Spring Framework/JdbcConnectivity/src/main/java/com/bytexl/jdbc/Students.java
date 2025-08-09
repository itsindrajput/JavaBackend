package com.bytexl.jdbc;

public class Students {
	private int rollNo;
	private String name;
	private String course;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	
	public Students(int rollNo, String name, String course) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + ", course=" + course + "]";
	}
}
