<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RESULTAT</title>
</head>
<body>

	<%!int num1 = 0;
	int num2 = 0;%>
	<%
		if (request.getParameter("num1") != null) {
			num1 = Integer.parseInt(request.getParameter("num1"));
			num2 = Integer.parseInt(request.getParameter("num2"));
		}
	%>

	<%
		if (request.getParameter("suma") != null) {
			out.println(num1 + num2);
		} 
		else if (request.getParameter("mult") != null) {
			out.println(num1 * num2);
		} 
		else if (request.getParameter("div") != null) {
			out.println(num1 / num2);
		} 
		else if (request.getParameter("resta") != null) {
			out.println(num1 - num2);
		}
	%>
	
	<form action="iniciJSP.jsp" method="get">
		<button type="submit" id="back" name="back" value="back">Back</button>
	</form>

</body>
</html>