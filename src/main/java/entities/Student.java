package entities;

import java.util.ArrayList;

public class Student extends Person{

	double monthlyPayment;
	ArrayList<Subject> subjects;
	
	//GETTERS AND SETTERS
	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}

}
