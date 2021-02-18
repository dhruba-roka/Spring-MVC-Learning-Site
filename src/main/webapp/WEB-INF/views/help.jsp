<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>
<h1>This is help page.</h1>

<%-- 
<%
String name=(String)request.getAttribute("name");
Integer rollno=(Integer)request.getAttribute("rollno");
LocalDateTime time=(LocalDateTime)request.getAttribute("time");

%>
<h1>Name: <%=name %></h1>
<h1>RollNo: <%=rollno %></h1>
<h1>Date and time : <%=time.toString() %></h1>
 --%>
 
 <!-- printing values using Jsp EL(Expressiion language) -->
 <h1>Name: ${name}</h1>
<h1>RollNo: ${rollno }</h1>
<h1>Date and time: ${now} </h1>
<hr>

${marks} 


<!-- printing list values using jstl & jsp EL -->
<c:forEach var="item" items="${marks }">
	<h1>${item }</h1>

</c:forEach>
</body>
</html>