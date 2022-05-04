package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Student;
import logic.LogicStudents;

/**
 * Servlet implementation class SvShowStudents
 */
@WebServlet("/SvShowStudents")
public class SvShowStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvShowStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LogicStudents ls = new LogicStudents();
		Student s = new Student();
		ArrayList<Student> students = ls.showAllStudents();
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

/*
En doGet (), los parámetros se agregan a la URL y se envían junto con la información del encabezado. 
Esto no sucede en el caso de doPost (). En doPost (), los parámetros se envían por separado. 
Dado que la mayoría de los servidores web solo admiten una cantidad limitada de información que se adjuntará a los encabezados,
 el tamaño de este encabezado no debe exceder 1024 bytes. doPost () no tiene esta restricción. Por lo general,
  a los programadores les resulta difícil elegir entre doGet () y doPost ().

doGet () se utilizará cuando una pequeña cantidad de datos y datos insensibles, como una consulta,
 deben enviarse como una solicitud. doPost () se utilizará cuando se deba enviar una cantidad relativamente grande de datos confidenciales. 
 Algunos ejemplos son el envío de datos después de completar un formulario o el envío de identificación de usuario y contraseña.
*/