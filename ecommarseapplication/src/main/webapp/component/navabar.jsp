<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ page import="com.ojas.modal.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-black bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent ml-auto">
       <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Home.jsp"><i class="fa-solid fa-cart-shopping"></i>E-commerase web site</a>
        </li>
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0 ">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
         <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">cart</a>
        </li>
        <%
        if(user !=null){%>
        	
        	  <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="#">order</a>
            </li>
            
            <li class="nav-item">
            <a class="nav-link" href="/LogourUser">logout</a>
          </li>
        	
        <% }else{%>
        	
        	 <li class="nav-item">
             <a class="nav-link active" aria-current="page" href="login.jsp">login</a>
           </li>
        	
       <%  }
        %>
         
        
       
       
     
      </ul>
      
    </div>
  </div>
</nav>

</body>
</html>