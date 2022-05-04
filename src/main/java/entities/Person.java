package entities;

import java.time.LocalDate;

public abstract class Person {

	int idPerson;
	char gender;
	String name,surname;
	LocalDate date_birth;
	
	//GETTERS AND SETTERS
	public int getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public LocalDate getDate_birth() {
		return date_birth;
	}
	public void setDate_birth(LocalDate date_birth) {
		this.date_birth = date_birth;
	}

}
