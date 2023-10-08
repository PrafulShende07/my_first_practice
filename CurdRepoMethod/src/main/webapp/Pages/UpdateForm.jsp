<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update User Data</h1>
	<form action="/updateUserData">
		<table>
			<tr>
				<td>User ID :</td>
				<td><input type="text" name="uid"></td>
			</tr>
         <tr>
				<td>First Name :</td>
				<td><input type="text" name="fname"></td>
			</tr>
			
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lname"></td>
			</tr>
			
			<tr>
				<td>Address :</td>
				<td><input type="text" name="address"></td>
			</tr>
			
			<tr>
				<td>Marks :</td>
				<td><input type="text" name="marks"></td>
			</tr>
			
			<tr>
				<td><input type="submit" value="UPDATE"></td>
			</tr>
		</table>
	</form>
</body>
</html>