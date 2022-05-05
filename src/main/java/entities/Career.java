package entities;


public class Career {

	int idCareer;
	String name;
	Subject subjects;
	Year years;
	
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
	public Subject getSubjects() {
		return subjects;
	}
	public void setSubjects(Subject subjects) {
		this.subjects = subjects;
	}
	public Year getYears() {
		return years;
	}
	public void setYears(Year years) {
		this.years = years;
	}
		
}
