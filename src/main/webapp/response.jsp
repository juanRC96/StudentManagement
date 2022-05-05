<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align: center"><%=request.getParameter("message")%></h1>

	<form method="post" action="index.html">
		<button id="iniciar" type="submit">Volver al menú</button>
	</form>

</body>
</html>