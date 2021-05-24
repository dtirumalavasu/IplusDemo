<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%
	  session = request.getSession();

	com.toyota.model.Delar d = (com.toyota.model.Delar) request.getAttribute("delar");
	if(d != null){
		session.setAttribute("delar", d);
	}
	
	response.sendRedirect("./");  
	  
%>
</html>