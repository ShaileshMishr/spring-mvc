<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Login Page</h1>
<form action="home">
<label for="uname">Enter User Name :-</label>
<input type="text" name="userName" placeholder="UserName" ><br><br>
<label for="pass">Enter PassWord :-</label>
<input type="password" name="password" placeholder="Password" ><br><br>

<input type="submit" value="Login">
</form>
<div style="color:red">${fail}</div>
<div style="color:green">${success}</div>
</body>
</html>