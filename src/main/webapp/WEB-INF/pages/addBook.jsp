<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Add a new Book!</h1>
    	<form action="addBook" method="post">
	    	<input type = "text" name = "bookName" placeholder = "Enter Product Name"/><br><br>
	    	<input type = "text" name = "authorName" placeholder = "Enter Product Description"/><br><br>
	    	<input type = "number" name = "price" placeholder = "Enter Price"/><br><br>
	    	<input type = "submit" value = "Add Book"/><br><br>
   	    </form>
   	    
   	    <h3 style="color:red">${msg}</h3>

</body>
</html>