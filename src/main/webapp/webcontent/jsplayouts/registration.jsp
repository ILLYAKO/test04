<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Data</title>
</head>
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
	<h1>Registration Form</h1>
	<div class="ex">
		<form action="registrationUser" method="post">
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="userfirstname" /></td>
				</tr>
				<tr>
					<td>Second Name</td>
					<td><input type="text" name="usersecondname" /></td>
				</tr>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="userpassword" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="userage" /></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="text" name="usergender" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="useremail" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="useraddress" /></td>
				</tr>
			</table>
			<input type="submit" value="register" />
		</form>
		<br>

	</div>
</body>
</html>