<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="GestorTreballadors" method="get">
	<br> 
		DNI: <input type="text" id="dni" name="dni" required /> 
	</br>
	<br>
		<button type="submit" id="submitFindByDNI" name="submitFindByDNI" value="submitFindByDNI">Submit</button>
	</br>
</form>
</body>
</html>