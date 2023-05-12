<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" import="java.util.* ,com.ojas.springxml.model.*" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Student> student=(List<Student>)request.getAttribute("liststu");
%>
 <table>
      <tr>
        
         <td width="150">First Name</td>
         <td width="150">Last Name</td>
         <td width="100">Marks</td>
         <td width="50">city</td>
      </tr>
  <%--  <c:forEach items="${student}" var="student">
       <tr>
          <td><c:out value="${student.fristName}" /></td>
          <td><c:out value="${student.lastName}" /></td>
          <td><c:out value="${student.marks}" /></td>
          <td><c:out value="${student.city}" /></td>
         
        </tr>
       </c:forEach> --%>
       <%
         for(Student st: student)
        {%>
           out.println(st);
      <%} %>  
      
      </table>
</body>
</html>