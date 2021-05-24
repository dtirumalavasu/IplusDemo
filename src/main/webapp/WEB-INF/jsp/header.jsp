<%@ page import="com.toyota.model.Customer" %>
<%@ page import="com.toyota.model.Delar" %>
<body style="margin: 0;">
<div class="header">
	<table  ><tr>
	<td><a href="/">Home</a></td>
	<td><a href="/contact">Contact us</a></td>
	<td><a href="delar.jsp">Find Delars</a></td>
	<td><a href="state.jsp">Select State</a></td>
	<td><a href="/product">Vehicles</a></td>
	<td><a href="/listproducts">VehicalList</a></td>
	
	<%
		Customer customer = (Customer)session.getAttribute("customer"); 
		if(customer != null){
			%>
	        <td><a href="favorite.jsp">AddFavorite</a></td>
			<td><a href="price.jsp">Price</a></td>
			<td><a href="clogout.jsp">Logout</a></td>
			<td>Welcome: ${customer.customerName}</td>
			
			<%
		}else{
			%>
			<td><a href="/clogin">Customer Login</a></td>
			<td><a href="/customerRegister">Register</a></td>
			<%
		}
	
	%>
	
	<%
		Delar delar = (Delar)session.getAttribute("delar");
		if(delar!= null){
			%>
			<td><a href="Branch.jsp">BranchDetails</a></td>
			<td><a href="products.jsp">ListProducts</a></td>
			<td><a href="Dlogout.jsp">Logout</a></td>
			<td>Welcome: ${delar.delarName}</td>
			
			<%
		}else{
			%>
			<td><a href="/dlogin">Delar Login</a></td>
			<td><a href="/delarRegister">DelarRegister</a></td>
			<%
		}
	
	%>
	
	
	</tr></table>
	
</div>
<style>
.header{
	height: 80px;
	background-color: #37474F;
}
.header table{
    text-decoration: none;
    color: #fff;
    padding: 13px;
    font-size: 14px;
    font-family: candara, sans-serif;
    float: right;
    margin-right: 15%;
}
.header a{
    text-decoration: none;
    color: #fff;
    padding: 10px;
    cursor: pointer;
}


</style>
