<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

<h1>/help url fired</h1>
<%-- 
	<%
		String name = (String) request.getAttribute("name");
		Integer rollNumber =(Integer) request.getAttribute("rollNumber");
		LocalDateTime now =(LocalDateTime) request.getAttribute("now");
	%> --%>
	
	<h1>Hello my name is <%-- <%=name %> --%> ${name} and my rollNumber is ${rollNumber} <%-- <%=rollNumber%> --%></h1>
	
	<h2>Time in Saharsa is ${now} <%-- <%=now %> --%></h2>
	
	<hr>
	
	<%-- <h1>${marks}</h1> --%>
	
	<c:forEach var="item" items="${marks}">
		<h1>${item}</h1>
	</c:forEach>

</body>
</html>