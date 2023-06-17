<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>

 <h2>Student name is ${ student.name }</h1>
 <h2>Student id is ${ student.id }</h1>
 <h2>Student dob is ${ student.date }</h1>
 <hr>
 <h2>Subjects are : ${ student.subjects }</h1>
 <h2>Student gender is ${ student.gender }</h1>
 <h2>Student Type is ${ student.type }</h1>
 <hr>
 <h2>City is ${ student.address.city }</h1>
 <h2>Street is ${ student.address.street }</h1>
 <hr>
 <h2>Address is ${ student.address }</h1>

</body>
</html>