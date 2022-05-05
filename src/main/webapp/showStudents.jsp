<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="entities.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>students</title>
</head>

<%
ArrayList<Student> students = (ArrayList) request.getAttribute("allstudents");


if((students.isEmpty())==false)
{
	%>
<body>	
	<h1>Students</h1>
	
	<table>

		<td><b> ID  </b></td>
		<td><b> SURNAME </b></td>
		<td><b> NAME </b></td>
		<td><b> GENDER </b></td>
		<td><b> DATE OF BIRTH </b></td>
		<td><b> ID SUBJECT </b></td>
	
<% 	
for(Student s: students)
{
	%>
<tr>
	<td><%=s.getIdPerson()%></td>
	<td><%=s.getSurname()%></td>
	<td><%=s.getName()%></td>
	<td><%=s.getGender()%></td>
	<td><%=s.getDate_birth() %></td>
	<td><%=s.getIdSubject()%></td>
</tr>
<%
}

}else
{
	%>
	<h1>No hay doctores coincidentes</h1>
	<%
}
%>

</body>
</html>