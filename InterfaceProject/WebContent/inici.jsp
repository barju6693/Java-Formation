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
		Nom: <input type="text" id="nom" name="nom" required />
		Cognom 1: <input type="text" id="cognom1" name="cognom1" required />
		Cognom 2: <input type="text" id="cognom2" name="cognom2" required />
		Email: <input type="text" id="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" />
		Telefon: <input type="text" id="tlf" name="tlf" required />
		DNI: <input type="text" id="dni" name="dni" required />
		Data Naixement: <input type="text" id="dataN" name="dataN" required pattern="[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]$" />
		
		<input type="radio" id="Afegir" name="Afegir" value="Afegir">Afegir</button>
		<input type="radio" id="Borrar" name="Borrar" value="Borrar">Borrar</button>
		<input type="radio" id="borrT" name="borrT" value="borrT">Borrar tot</button>
		
		<button type="submit" id="submit" name="submit" value="submit">Submit</button>
	</form>
</body>
</html>