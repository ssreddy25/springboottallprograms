<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.ojas.modal.*"%>

<%
	User user = (User) request.getSession().getAttribute("user");
	if (user != null) {

		request.getSession().setAttribute("user", user);
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="../component/allcss.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../component/navabar.jsp"%>

	<h1 style="text-align:center">ALL Products</h1>
	<div class="container">
		<div class="row">
			<div class="col-sm-3">

				<div class="card col-sm-2" style="width: 18rem;">
					<img src="./productimages/babygrildress.jpg"  class="card-img-top img-thumbnail " 
						alt="image">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<h6 class="price">price:$4.25</h6>
						<h6 class="categroey">categroey:some categroy</h6>
						<div>
						<a href="#" class="btn btn-primary">add to cart</a> <a href="#"
							class="btn btn-primary ms-5">buy</a>
							</div>
					</div>
				</div>
			</div>
	
          <div class="col-sm-3">

				<div class="card col-sm-2" style="width: 18rem" >
					<img src="./productimages/multibags.jpg" class="card-img-top img-thumbnail" style="height :400px"
						alt="image">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<h6 class="price">price:$4.25</h6>
							<h6 class="categroey">categroey:some categroy</h6>
						<div>
						<a href="#" class="btn btn-primary">add to cart</a> <a href="#"
							class="btn btn-primary ms-5">buy</a>
							</div>
					</div>
				</div>
			</div>
			
			<div class="col-sm-3">

				<div class="card col-sm-2" style="width: 18rem;">
					<img src="./productimages/reddress.jpg" class="card-img-top" style="height :400px"
						alt="image">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
							<h6 class="price">price:$4.25</h6>
							<h6 class="categroey">categroey:some categroy</h6>
						<div>
						<a href="#" class="btn btn-primary">add to cart</a> <a href="#"
							class="btn btn-primary ms-5">buy</a>
							</div>
					</div>
				</div>
			</div>
			<div class="col-sm-3">

				<div class="card col-sm-2" style="width: 18rem;">
					<img src="./productimages/ruunningshoes.jpg" class="card-img-top" style="height :400px"
						alt="image">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
							<h6 class="price">price:$4.25</h6>
							<h6 class="categroey">categroey:some categroy</h6>
						<div>
						<a href="#" class="btn btn-primary">add to cart</a> <a href="#"
							class="btn btn-primary ms-5">buy</a>
							</div>
					</div>
				</div>
			</div>
			<div class="col-sm-3">

				<div class="card col-sm-2" style="width: 18rem;">
					<img src="./productimages/smart_watch.jpg" class="card-img-top" style="height :300px"
						alt="image">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
							<h6 class="price">price:$4.25</h6>
						<h6 class="categroey">categroey:some categroy</h6>
						<div>
						<a href="#" class="btn btn-primary">add to cart</a> <a href="#"
							class="btn btn-primary ms-5">buy</a>
							</div>
					</div>
				</div>
			</div>
			<div class="col-sm-3">

				<div class="card col-sm-2" style="width: 18rem;">
					<img src="./productimages/speakar.jpg" class="card-img-top" style="height :300px"
						alt="image">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
							<h6 class="price">price:$4.25</h6>
							<h6 class="categroey">categroey:some categroy</h6>
						<div>
						<a href="#" class="btn btn-primary">add to cart</a> <a href="#"
							class="btn btn-primary ms-5">buy</a>
							</div>
					</div>
				</div>
			</div>
			<div class="col-sm-3">

				<div class="card col-sm-2" style="width: 18rem;">
					<img src="./productimages/waterbattile.png" class="card-img-top" style="height :300px"
						alt="image">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
							<h6 class="price">price:$4.25</h6>
						<p class="card-text">
							<h6 class="categroey">categroey:some categroy</h6>
						<div>
						<a href="#" class="btn btn-primary">add to cart</a> <a href="#"
							class="btn btn-primary ms-5">buy</a>
							</div>
					</div>
				</div>
			</div>
	
	
		
			<div class="col-sm-3">

				<div class="card " style="width: 18rem;">
					<img src="./productimages/zixerment shoes.jpg" class="card-img-top" style="height :300px"
						alt="image">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
							<h6 class="price">price:$4.25</h6>
							<h6 class="categroey">categroey:some categroy</h6>
						<div>
						<a href="#" class="btn btn-primary">add to cart</a> <a href="#"
							class="btn btn-primary ms-5">buy</a>
							</div>
					</div>
				</div>
			</div>
		</div>

	</div>
</body>
</html>