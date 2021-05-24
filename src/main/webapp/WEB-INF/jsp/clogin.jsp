<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<%@ include file="header.jsp" %>


	<body>
 
<form action="openCustomer" method="post">
<table border="0" align="center" cellpadding="10">
	    <tr style="font-size:16px;color:black"> 
		<td>customerName</td><td><input type="text" name="customerName" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>customerPassword</td><td><input type="password" name="customerPassword" ></td>
		<tr style="font-size:16px;color:black"> 
		<td><input type="submit" value="Login"></td>
</table>
</form>

	${msg}
</body>
</html>