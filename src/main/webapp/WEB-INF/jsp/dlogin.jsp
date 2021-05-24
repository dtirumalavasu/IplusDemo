<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

</head>
<%@ include file="header.jsp" %>


	<body>
 
<form action="openDelar" method="post">
<table border="0" align="center" cellpadding="10">
	    <tr style="font-size:16px;color:black"> 
		<td>DelarName</td><td><input type="text" name="delarName" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>DelarPassword</td><td><input type="password" name="DelarPassword" ></td>
		<tr style="font-size:16px;color:black"> 
		<td><input type="submit" value="Login"></td>
</table>
</form>

	${msg}
</body>
</body>
</html>