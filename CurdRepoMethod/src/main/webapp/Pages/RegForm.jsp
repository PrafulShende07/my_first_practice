<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: red;">
		<marquee>USER REG FORM</marquee>
	</h1>
	<form action="/saveUser">
		<table style="text-align: center;">

			<tr>
				<td style="color: brown;">FIRST NAME :</td>
				<td><input type="text" name="fname"></td>
			</tr>

			<tr>
				<td style="color: brown;">LAST NAME :</td>
				<td><input type="text" name="lname"></td>
			</tr>

			<tr>
				<td style="color: blue;">ADDRESS :</td>
				<td><input type="text" name="address"></td>
			</tr>

			<tr>
				<td style="color: blue;">MARKS :</td>
				<td><input type="text" name="marks"></td>
			</tr>

			<tr>
				<td><input style="color: red;" type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>