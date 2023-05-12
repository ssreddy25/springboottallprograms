<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="../component/Allcss.jsp"%>
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<form action="../AddServelet" method="get">
			<h1 style="color: green">add specasilist </h1>
			<!-- Email input -->
			<div class="form-outline mb-4">
				<input type="text" name="spname" class="form-control" /> <label
					class="form-label" for="form2Example1">specaislist</label>
			</div>

			




			<!-- Submit button -->
			<button type="submit" class="btn btn-primary btn-block mb-4">add</button>

			


		</form>
	</div>


</body>
</html>