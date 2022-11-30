package edu.monmouth.lab2;

public class Professor extends Person{
	private int salary;
	
	public Professor(String name, int yearOfBirth, int salary) {
		super(name, yearOfBirth);
		setSalary(salary);
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getsalary() {
		return this.salary;
		
	}
	
	public String toString() {
		return super.toString() + " salary=" + this.salary;
	}

}
