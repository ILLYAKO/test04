<%@page import="com.illya.web.domain.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor = "LightGreen ">
in show user: <br>

	<%
		User user1 = (User)session.getAttribute("user");

		out.println("<p>User First Name: " + user1.getUserFirstName() + " </p>");
		out.println("<p>User ID: " + user1.getUserID() + " </p>");
		out.println("<p>User: " + user1 + " </p>" );
		System.out.println(user1);
	%>

</body>
</html>