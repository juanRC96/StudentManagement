package logic;

import java.util.ArrayList;

import data.DataStudents;
import entities.Student;

public class LogicStudents {
	
	DataStudents ds = new DataStudents();

	public ArrayList<Student> showAllStudents() throws Exception
	{
		return ds.showAllStudents();
	}
	
}
