<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align :center">PRODUCT REGISTRITION Form</h1>
${msg}
<form:form action="./insert" modelAttribute="product">

ProductName:<form:input path="productName" placeholder="enterprodutname"/>
ProductQTY:<form:input path="productQty" placeholder="enterproductqty"/>
ProductPrice:<form:input path="productPrice" placeholder="enterproductprice"/>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>