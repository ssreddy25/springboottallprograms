<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student login form</h1>
<form action="./loginform">
<hr>
${status}
<hr>
id:<input type="text" name="id"/><br/>
fristName:<input type="text" name="fristName"/><br/>
<input type="submit" add="submit"/>
</form>

</body>
</html>