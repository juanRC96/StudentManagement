package entities;

import java.util.ArrayList;

public class Subject {

	int idSubject;
	String name;
	Year year;
	ArrayList<Professor> professors;
	ArrayList<Student> students;
	
	//GETTERS AND SETTERS
	public int getIdSubject() {
		return idSubject;
	}
	public void setIdSubject(int idSubject) {
		this.idSubject = idSubject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public ArrayList<Professor> getProfessors() {
		return professors;
	}
	public void setProfessors(ArrayList<Professor> professors) {
		this.professors = professors;
	}
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

}
