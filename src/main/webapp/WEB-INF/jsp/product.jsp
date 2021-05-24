<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
	<%@ include file="header.jsp"%>
	<form action="addProduct" method="post">
		<table border="0" align="center" cellpadding="10">
			<tr style="font-size: 16px; color: black">
				<td>productName</td>
				<td><input type="text" name="productName"></td>
			<tr style="font-size: 16px; color: black">
				<td>ProductPrice</td>
				<td><input type="text" name="productPrice"></td>

				<td><input type="submit" value="AddVehicles"></td>
		</table>
	</form>

</body>
</html>
${pmsg}