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
<%--
        <div id="header">
            <jsp:include page="../jsplayouts/mutual/header.jsp"/>
        </div>
--%>
        <div id="header">
                    <div id="menu">
                        <a href="/test04/index.jsp">HOME</a>
                        <a href="/test04/webcontent/jsplayouts/login.jsp">login</a>
                        <a href="/test04/webcontent/jsplayouts/userLogout">logout</a>
                        <a href="/test04/webcontent/jsplayouts/userComplaint.jsp">complaints</a>
                        <a href="/test04/webcontent/jsplayouts/userSchedule.jsp">schedule</a>
                        <a href="/test04/webcontent/jsplayouts/userProgress.jsp">progress</a>
                        <a href="https://www.sunlife.ca/ca/Insurance/Health+insurance?vgnLocale=en_CA">shop</a>
                    </div>
        </div>



        <div id="main">
                <h1>Welcome page</h1>
                    <%
                        User regUser = (User)session.getAttribute("user");
                        out.println("<p>Welcome " + regUser.getUserFirstName() + ", in your Healthy Habits site.</p>");

                    %>
        </div>
 <%--
        <div id="footer">
            <jsp:include page="/mutual/footer.jsp"/>
        </div>

 --%>

</body>
</html>