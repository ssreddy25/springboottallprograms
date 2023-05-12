<%@ page import="com.ojas.db.*" %>
<%@ page import="com.ojas.dao.*" %>
<%@ page import="java.sql.Connection" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <%@ include file="../component/Allcss.jsp" %> 

<title>Insert title here</title>
</head>
<body>
<%--  <%@ include file="component/NavaBar.jsp" %>  --%>

<%@ include file="../component/NavaBar.jsp" %>
 

<% Connection con=DBUtility.getConnection();
out.println(con);
%>

<div id="carouselExampleFade" class="carousel slide carousel-fade" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img/back3.jpg" class="d-block w-100" alt="image" height="500px">
    </div>
    <div class="carousel-item">
      <img src="img/back4.jpg" class="d-block w-100" alt="image"height="500px">
    </div>
    <div class="carousel-item">
      <img src="img/back.jpg" class="d-block w-100" alt="image"height="500px">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleFade" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span> 
  </button>
</div>

 <%@ include file="../component/footer.jsp" %>



  



	
</body>
</html>