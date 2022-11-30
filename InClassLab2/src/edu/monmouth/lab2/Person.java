package edu.monmouth.lab2;

public class Person {
    private String name;
    private int yearOfBirth;

    public Person(String name, int id) {
	setName(name);
	setYearOfBirth(id);
    }

    @Override
    public String toString() {
	return "Person [name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

}
