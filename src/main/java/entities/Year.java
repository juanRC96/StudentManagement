package entities;

import java.util.ArrayList;

public class Year {

	int number;
	Career career;
	ArrayList<Subject> subjects;
	
	//GETTERS AND SETTERS
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Career getCareer() {
		return career;
	}
	public void setCareer(Career career) {
		this.career = career;
	}
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}
	
}
