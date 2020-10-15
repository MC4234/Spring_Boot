<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
   <%-- this is a java comment --%>
   <!-- this is a HTML comment -->
   
   <h1>Welcome home <%= request.getParameter("name")%>!</h1>
   
   <h1>Your age is <%= request.getParameter("age")%></h1>
   
   <%! int i=0; %>
   
  <h3>Count <%= i++ %>!</h3>
</body>
</html>