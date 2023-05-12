<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
 <%@ page isELIgnored = "false" %>
 <%@page import="com.ojas.dao.DoctorDAO" %>
 <%@page import="com.ojas.dao.DoctorDAOImplemenataion"%>
<%@page import="com.ojas.entity.Doctor" %>
<%@ page import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="../component/Allcss.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<%@ include file="NavaBar.jsp"%>
	<h1>doctor page</h1>
	<div class="container-fluid p-3">
		<div class="row">
			<div class="col-md-4">
				<div class="card point-card">
					<div class="card-body">
					   <p class="fs-3 text-center"> ADD DOCTOR </p>
					   
						

						<c:if test="${not empty errormsg }">
							<p class="text-center text-danger fs-3 ">${errormsg}</p>
							<c:remove var="errormsg" scope="session" />
						</c:if>
						<c:if test="${not empty suessmsg }">
							<p class="text-center text-success fs-3 ">${suessmsg}</p>
							<c:remove var="suessmsg" scope="session" />
						</c:if>
						<form action="../AddDoctor" method="post">
							<div class="mb-3">
								<label for="exampleFullName" class="form-label">Full
									Name</label> <input type="text" class="form-control" name="fname"
									required>

							</div>
							<div class="mb-3">
								<label for="exampleDateOfBrith" class="form-label">DOB</label> <input
									type="date" class="form-control" name="dob" required>

							</div>
							<div class="mb-3">
								<label for="exampleQualification" class="form-label">Qualification</label>
								<input type="text" class="form-control" name="qlafication"
									required>

							</div>
							<div class="mb-3">
								<label for="example" class=spacalist"form-label">Specalist</label>
								<input type="text" class="form-control" name="splist" required>

							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Email
									a</label> <input type="email" class="form-control" required
									name="email" aria-describedby="emailHelp">

							</div>
							<div class="mb-3">
								<label for="examplePhoneNumber" class=spacalist"form-label">phoneNuber</label>
								<input type="text" class="form-control" required name="phone">

							</div>
							<div class="mb-3">
								<label for="examplePhoneNumber" class=spacalist"form-label">password</label>
								<input type="password" class="form-control" required name="pwd">

							</div>

							<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>
				</div>
			</div>
			<div class="col-md-8">
				<div class="card point-card">
					<div class="card-body">
						<p class="fs-3 text-center">DOCTOR DETAILS</p>
						<table class="table">
							<thead>
								<tr>
									<th scope="col">full name</th>
									<th scope="col">dob</th>
									<th scope="col">qualification</th>
									<th scope="col">speciakist</th>
									<th scope="col">email</th>
									<th scope="col">mob no</th>
									<th scope="col">action</th>
								</tr>
							</thead>
							<tbody>
								<%
								 
								DoctorDAO dao= new DoctorDAOImplemenataion();
										List<Doctor>doctor=dao.viewAllDoctor();
										
										for(Doctor docotors:doctor)
										{%>
										
										<tr>
										<td><%=docotors.getDoctorFullName()  %></td>
										<td><%= docotors.getDoctorDateOfBrith() %></td>
										<td><%=docotors.doctorQualificatio %></td>
										<td><%=docotors.getDoctorSpecialist() %></td>
										<td><%=docotors.getDoctorEmail() %></td>
										<td><%=docotors.getDoctorPhoneNumber() %></td>
										<td>
										<a href="edit_doctor.jsp?id=<%=docotors.getDoctorId()%>" class="btn btn-primary">edit</a>
										</td>
										<td><a href="delete_doctor.jsp?id=<%=docotors.getDoctorId()%>" class="btn btn-danger">delete</a>
										</td>
										</tr>
											
										<% }
										
									
								%>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>