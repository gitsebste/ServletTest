<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Testing JSP</title>
</head>
<body>

<h3>Enter some Info:</h3>
<form action="ProcessInfo" method="post">

<label>First Name: </label>
<input type="text" name="firstName"><br>

<label>Last Name: </label>
<input type="text" name="lastName"><br>

<label>Phone: </label>
<input type="text" name="phone"><br>

<input type="submit" value="Send"><br>
</form>

</body>
</html>