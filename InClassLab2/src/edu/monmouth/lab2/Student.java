package edu.monmouth.lab2;

public class Student extends Person{
	private int id;
	private String major;
	
	public Student(String name, int yearOfBirth, int id, String major) {
		super(name, yearOfBirth);
		setId(id);
		setMajor(major);
	}
	
	public void setId(int id) {
		this.id = id;
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	@Override 
	public String toString() {
		return super.toString() + " id=" + this.id + " major=" + this.major;
	}

}
