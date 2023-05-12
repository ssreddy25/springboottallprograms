<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${fristName}
${lastName}
${marks}
${like}
<%-- <%
String fristName=(String) request.getAttribute("fristName");
String lastName=(String) request.getAttribute("lastName");
String marks=(String) request.getAttribute("marks");
String like=(String) request.getAttribute("like");
%>

<h1> fristName:<%= fristName %></h1>
<h1> lastName:<%= lastName %></h1>
<h1> marks:<%= marks %></h1>
<h1> like:<%= like %></h1> --%>
</body>
</html>