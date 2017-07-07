package com.test.tpg;

public class StudentInformation{
	
	private Integer id;
	private String name;
	private Double gpa;
	
	public StudentInformation(Integer id, String name, Double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "StudentInformation [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
	}
}
