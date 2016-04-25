<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CALCULADORA</title>
</head>
<body>
	
	<form action="calculs.jsp" method="get">
		<input type="text" id="num1" name="num1" value=0 />
		<input type="text" id="num2" name="num2" value=0 />
		<input type="radio" id="suma" name="suma" value="suma">Suma</button>
		<input type="radio" id="mult" name="mult" value="mult">Mult</button>
		<input type="radio" id="div" name="div" value="div">Div</button>
		<input type="radio" id="resta" name="resta" value="resta">Resta</button>
		<button type="submit" id="submit" name="submit" value="submit">Submit</button>
	</form>
	
	
</body>
</html>