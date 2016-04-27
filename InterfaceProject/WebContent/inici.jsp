<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>Insert title here</title>
</head>
<body>

<form action="GestorTreballadors" method="get">
	<br> 
		Nom: <input type="text" id="nom" name="nom" required /> 
		Cognom 1: <input type="text" id="cognom1" name="cognom1" required /> 
		Cognom 2: <input type="text" id="cognom2" name="cognom2" required />
	</br>
	<br> 
		Email:	<input type="text" id="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" /> 
		Telefon: <input type="text" id="tlf" name="tlf" required />
	</br>
	<br> 
		DNI: <input type="text" id="dni" name="dni" required /> 
		Data Naixement:	<input type="text" id="dataN" name="dataN" required	pattern="[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]$" />
	</br>
	<br>
		<button type="submit" id="submitAdd" name="submitAdd" value="submitAdd">Submit</button>
	</br>
</form>

</body>
</html>