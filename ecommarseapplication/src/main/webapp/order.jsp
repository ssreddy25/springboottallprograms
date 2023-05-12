<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.ojas.modal.*" %>
    
    <%
    User user=(User)request.getSession().getAttribute("user");
    if(user!=null){
    	
    	request.getSession().setAttribute("user", user);
    	response.sendRedirect("Home.jsp");
    }
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="../component/allcss.jsp" %>
<title>order page</title>
</head>
<body>
<%@ include file="../component/navabar.jsp" %>

</body>
</html>