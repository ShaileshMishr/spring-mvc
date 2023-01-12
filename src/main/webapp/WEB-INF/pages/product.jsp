<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product List:</h1>
	
	<table border="1">
		<tr>
			<th>Prod_ID</th>
			<th>Prod_Name</th>
			<th>Prod_Desc</th>
			<th>Price</th>
			<th>Action</th>
			<th>Action</th>
			<c:forEach items="${productList}" var="product">
				<tr>
					<td>${product.getProdId()}</td>
					<td>${product.getProdName()}</td>
					<td>${product.getProdDesc()}</td>
					<td>${product.getPrice()}</td>
					<td><a href = "delete/${product.getProdId()}">Delete</a>&nbsp
						<a href = "update/${product.getProdId()}/${product.getProdName()}/${product.getProdDesc()}/
						${product.getPrice()}">Update</a>
						</td>
					
				</tr>

			</c:forEach>

	</table>
	<h3 style="color:red">${delMsg}</h3>
	

</body>
</html>