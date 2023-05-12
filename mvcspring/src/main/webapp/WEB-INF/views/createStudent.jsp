<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>student reigster form</h1>
<hr>
<h1>${status}</h1>
<form action="./createstudents">
id:<input type="text" name="id"/><br/>
fristName:<input type="text" name="fristName"/><br/>
lastName:<input type="text" name="lastName"/><br/>
marks:<input type="text" name="marks"/><br/>
<input type="submit" add="submit"/>
</form>

</body>
</html>