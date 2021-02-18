<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
</head>
<body>
<h1>This is about page.</h1>

  <%
	String name=(String)request.getAttribute("name");
    Integer roll=(Integer)request.getAttribute("id");
    List<String> friends =(List<String>)request.getAttribute("f");
	
   %>
   <h1>The Name is: <%=name%></h1>
   <h1>The RollNo is: <%=roll%></h1>
   		
   		<%
   		    for(String s:friends){
   		    	out.println(s);
   		    }
   		
   		%>
</body>
</html>