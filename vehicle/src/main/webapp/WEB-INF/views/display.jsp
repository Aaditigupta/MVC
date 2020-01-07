<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"
	integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
	crossorigin="anonymous">
	
</script>
<script type="text/javascript" src="/resources/demo1.js"></script>
<title>User Detail</title>
</head>
<body style="background-image: url('resources/images/images.jpg');background-repeat: no-repeat; background-size:100%;">
	<form >


		<h1 align="center">User Detail</h1>

<c:forEach var="userone" items="${users}">
<c:if test="${userone.vehicledto != null}">
<h2 align="center">${userone.userName}</h2>

<table border="1" cellpadding="2" cellspacing="2" align="center">



     <th> Vehicle Id</th>
	<th>Vehicle Name</th>
	<th>Vehicle Code</th>
	<th> Vehicle State</th>
	<th> Vehicle Country</th>
	<c:forEach var="vehicleone" items="${userone.vehicledto}">
<tr>
    <td> ${vehicleone.vehicleId}</td>
	<td> ${vehicleone.vehicleName}</td>
	<td> ${vehicleone.vehicleCode}</td>
	<td> ${vehicleone.vehicleState}</td>
	<td>${vehicleone.vehicleCountry}</td>
	
	</tr>
</c:forEach>

</table>
		
	</c:if>
</c:forEach>


				
	</form>
	 <span class="glyphicon glyphicon-menu-left"> <input type="button"  style="font-size: 25px;" value="Back" onclick="history.back()"></span>  </button>
</body>
</html>