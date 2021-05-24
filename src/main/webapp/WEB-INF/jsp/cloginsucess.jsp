<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%
	  session = request.getSession();

	com.toyota.model.Customer c = (com.toyota.model.Customer) request.getAttribute("customer");
	if(c != null){
		session.setAttribute("customer", c);
	}
	
	response.sendRedirect("./");  
	  
%>
</html>