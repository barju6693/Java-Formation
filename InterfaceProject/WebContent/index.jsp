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

	<form action="inici.jsp" method="get">
		<button class="buton" type="submit" id="Afegirb" name="Afegirb" value="Afegirb">Afegir</button>
	</form>
	
	<form action="borrarPerDni.jsp" method="get">
		<button type="submit" id="Borrarb" name="Borrarb" value="Borrarb">Borrar</button>
	</form>
	
	<form action="GestorTreballadors" method="get">
		<button type="submit" id="borrTb" name="borrTb" value="borrTb">Borrar Tot</button>
	</form>
	<form action="GestorTreballadors" method="get">
		<button type="submit" id="showAll" name="showAll" value="showAll">Mostra Tot</button>
	</form>
	<form action="buscarPerDni.jsp" method="get">
		<button type="submit" id="Borrarb" name="Borrarb" value="Borrarb">Buscar per DNI</button>
	</form>
</body>
</html>