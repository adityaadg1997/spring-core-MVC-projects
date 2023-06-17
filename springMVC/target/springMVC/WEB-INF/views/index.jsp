<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home Page</title>
</head>
<body>
<h1>This is our home Page</h1>
<h2>welcome to homepage</h2>

<h1>url /home fired</h1>

<% 
	String name = (String) request.getAttribute("Name");
	Integer id =(Integer) request.getAttribute("id");
	List<String> friends =(List<String>) request.getAttribute("f");

%>

	<h2>Name is <%=name%></h2>
	<h2>ID is <%=id%></h2>
	
	<% for(String i: friends) {%>
		<h2><%=i %></h2>
	<% } %>

</body>
</html>