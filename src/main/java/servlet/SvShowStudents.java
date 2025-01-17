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
@WebServlet("/svshowstudents")
public class SvShowStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SvShowStudents() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LogicStudents ls = new LogicStudents();
		
		try 
		{
			ArrayList<Student> students = ls.showAllStudents();	
			request.setAttribute("allstudents", students);
			request.getRequestDispatcher("showStudents.jsp").forward(request, response);
		}
		catch (Exception e) 
		{
			response.sendRedirect("response.jsp?message=Error");
		}
		
	}

}

/*
En doGet (), los par�metros se agregan a la URL y se env�an junto con la informaci�n del encabezado. 
Esto no sucede en el caso de doPost (). En doPost (), los par�metros se env�an por separado. 
Dado que la mayor�a de los servidores web solo admiten una cantidad limitada de informaci�n que se adjuntar� a los encabezados,
 el tama�o de este encabezado no debe exceder 1024 bytes. doPost () no tiene esta restricci�n. Por lo general,
  a los programadores les resulta dif�cil elegir entre doGet () y doPost ().

doGet () se utilizar� cuando una peque�a cantidad de datos y datos insensibles, como una consulta,
 deben enviarse como una solicitud. doPost () se utilizar� cuando se deba enviar una cantidad relativamente grande de datos confidenciales. 
 Algunos ejemplos son el env�o de datos despu�s de completar un formulario o el env�o de identificaci�n de usuario y contrase�a.
*/