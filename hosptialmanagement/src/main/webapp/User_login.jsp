<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="component/Allcss.jsp" %>
<title>Insert title here</title>
</head>
<body>
<%@ include file="component/NavaBar.jsp" %>
<div class="container">
<form action="./login" method="post">
 <h1 style="color:green">user login page</h1>
  <!-- Email input -->
  <div class="form-outline mb-4">
    <input type="email" name="email" class="form-control" />
    <label class="form-label" for="form2Example1">Email address</label>
  </div>

  <!-- Password input -->
  <div class="form-outline mb-4">
    <input type="password" name="pwd" class="form-control" />
    <label class="form-label" for="form2Example2">Password</label>
  </div>



    
  <!-- Submit button -->
  <button type="submit" class="btn btn-primary btn-block mb-4">Login</button>
  
  <!-- Register buttons -->
		<div class="text-center">
			<p>
				Not a member? <a href="NewUser.jsp">Register</a>
			</p>
			</div>

  
</form>
</div>
<%@ include file="component/footer.jsp" %>
</body>
</html>