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
		
		
		try {
			con = DbConnector.getInstancia().getConexion();
			ps = con.prepareStatement("SELECT id,surname,name FROM students"); //PreparedStatement ps = con.prepareStatement(consulta);
			rs = ps.executeQuery();

			while (rs.next()) { //RS.NEXT devuelve un tipo booleano, verdadero si hay mas datos
				ArrayList<Student> students = new ArrayList<Student>();
				Student s = new Student();
				
				//s.setIdTratamient(rs.getInt(1));
				s.setIdPerson(rs.getInt(0));

				students.add(s);
			}

		} catch (Exception e) {
			System.err.println("Hubo un error");
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
		
		return null;
	}
	
}
