<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="component/Allcss.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<%@ include file="component/NavaBar.jsp"%>
	<div class="container">
		<form action="./adminlogin" method="post">
			<h1 style="color: green">admin login page</h1>

			
			<c:if test="${not empty errormsg }">
				<p class="text-center text-danger fs-3 ">${errormsg}</p>
				<c:remove var="errormsg" scope="session" />
			</c:if>
			<!-- Email input -->
			<div class="form-outline mb-4">
				<input type="email" name="email" class="form-control" /> <label
					class="form-label" for="form2Example1">Email address</label>
			</div>

			<!-- Password input -->
			<div class="form-outline mb-4">
				<input type="password" name="pwd" class="form-control" /> <label
					class="form-label" for="form2Example2">Password</label>
			</div>




			<!-- Submit button -->
			<button type="submit" class="btn btn-primary btn-block mb-4">Login</button>


		</form>
	</div>
	<%@ include file="component/footer.jsp"%>
</body>
</html>