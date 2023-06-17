<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>
    <h3 class="text-center">${Header}</h3>
    <h4 class="text-center">${Desc}</h4>
    
    <h1 style = "color:green">${message}</h1>
<h1>Your name is ${user.name}</h1>
<h1>Your email is ${user.email}</h1>
<h1>Your password is ${user.password}</h1>

</body>
</html>