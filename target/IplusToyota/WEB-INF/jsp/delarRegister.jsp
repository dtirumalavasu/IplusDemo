<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
<%@ include file="header.jsp" %> 
<form action="delarDoRegister" method="post">
<table border="0" align="center" cellpadding="10">
	
		
		<tr style="font-size:16px;color:black"> 
		<td>DelarName</td><td><input type="text" name="delarName" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>DelarPassword</td><td><input type="password" name="delarPassword" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>DalarPhone</td><td><input type="text" name="delarPho" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>DelarLocation</td><td><input type="text" name="delarLocation" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>DelarState</td><td><input type="text" name="delarState" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>DelarCity</td><td><input type="text" name="delarCity" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>DelarPincode</td> <td><input type="text" name="delarPincode" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>DelarGender</td> <td><input type="radio" name="delarGender" value="male">M<input type="radio" name="gender" value="female">F</td></tr>
		<td><input type="submit" value="Register"></td>
		</form>
		</table>
		
		${msg}

</body>
</html>