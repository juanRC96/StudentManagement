package entities;

import java.util.ArrayList;

public class Professor extends Person{

	double salary;
	ArrayList<Subject> subjects;
	
	//GETTERS AND SETTERS
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}
	
}
