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
<%@ include file="../component/allcss.jsp"%>
<title>login page</title>
</head>
<body>
	<%@ include file="../component/navabar.jsp"%>

	<div class="container">
		<div class="card w.50 mx.auto my.8">
			<div class="card-header text-center">user login</div>
			<div class="card-body">
				<form action="" method="post">

					<div class="from-group">
						<label>Email Address</label> <input type="email"
							class="form-control" name="email" placeholder="enter your email"
							required />
						<div class="from-group">
							<label>Password</label> <input type="password"
								class="form-control" name="pwd"
								placeholder="enter your password" required />
						</div>
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">login</button>

					</div>

				</form>
			</div>

		</div>
	</div>

</body>
</html>