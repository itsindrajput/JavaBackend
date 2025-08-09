package com.primitiveInjection;

public class Students {
	private int id;
	private String name;
	private float height;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public Students(int id, String name, float height) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", height=" + height + "]";
	}
}
