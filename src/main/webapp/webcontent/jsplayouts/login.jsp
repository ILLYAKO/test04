<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Login Page</title>
    </head>
    <body>
        <h2>User Details</h2>
        <form action="loginUser" method="post">
            Enter Username : <input type="text" name="username"><br/>
            Enter Password : <input type="password" name ="password"><br/>
                             <input type ="submit" value="Login">
        </form>
    </body>
</html>