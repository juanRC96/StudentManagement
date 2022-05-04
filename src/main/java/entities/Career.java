package entities;

import java.util.ArrayList;

public class Career {

	int idCareer;
	String name;
	ArrayList<Subject> subjects;
	ArrayList<Year> years;
	
	//GETTERS AND SETTERS
	public int getIdCareer() {
		return idCareer;
	}
	public void setIdCareer(int idCareer) {
		this.idCareer = idCareer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}
	public ArrayList<Year> getYears() {
		return years;
	}
	public void setYears(ArrayList<Year> years) {
		this.years = years;
	}
	
}
