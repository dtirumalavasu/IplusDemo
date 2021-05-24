<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<%@ include file="header.jsp" %> 
<form action="customerDoRegister" method="post">
<table border="0" align="center" cellpadding="10">
	
		
		<tr style="font-size:16px;color:black"> 
		<td>customerName</td><td><input type="text" name="customerName" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>customerPassword</td><td><input type="password" name="customerPassword" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>customerPhone</td><td><input type="text" name="customerPhone" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>customerEmail</td><td><input type="text" name="customerEmail" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>customerState</td><td><input type="text" name="customerState" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>customerCity</td><td><input type="text" name="customerCity" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>customerPincode</td> <td><input type="text" name="customerPincode" ></td>
		<tr style="font-size:16px;color:black"> 
		<td>customerGender</td> <td><input type="radio" name="customerGender" value="male">M<input type="radio" name="customerGender" value="female">F</td></tr>
		<td><input type="submit" value="Register"></td>
		</form>
		</table>
		${msg}

