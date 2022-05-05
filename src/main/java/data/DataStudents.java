package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.Student;

public class DataStudents {

	public ArrayList<Student> showAllStudents() throws Exception
	{
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		try {
			con = DbConnector.getInstancia().getConexion();
			ps = con.prepareStatement("SELECT idStudent,surname,name,gender,date_of_birth,monthly_payment,subjectId FROM students"); //PreparedStatement ps = con.prepareStatement(consulta);
			rs = ps.executeQuery();

			while (rs.next()) { //RS.NEXT devuelve un tipo booleano, verdadero si hay mas datos

				Student s = new Student();
				s.setIdPerson(rs.getInt(1));
				s.setSurname(rs.getString(2));
				s.setName(rs.getString(3));
				s.setGender(rs.getString(4).charAt(0));
				s.setDate_birth(rs.getDate(5).toLocalDate());
				s.setMonthlyPayment(rs.getDouble(6));
				s.setIdSubject(rs.getInt(7));
				
				students.add(s);
			}

		} catch (Exception e) {
			System.err.println("Hubo un error en el data");
			throw e;
		}

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				DbConnector.getInstancia().desconectar();
				;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return students;
	}
	
}
