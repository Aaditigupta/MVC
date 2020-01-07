<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	    


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
crossorigin="anonymous"></script>

<title>Insert Vehicle</title>


</head>
<body style="background-image: url('resources/images/first.jpg');background-repeat: no-repeat; background-size:100%;">
<form action="addvehicle" method="post" class="form">

<h2 align="center"> Insert Vehicle
</h2> 
<table align='center'>
<tr>
<td>
		Select User Name</td>
				<td>	  <select value="userName" name="userName">
			<c:forEach var="user" items="${users}">
				
						<option value="${user.userName}">${user.userName} </option>
					
			</c:forEach>
			</select>
					</td>
</tr>
<tr>
<td>

		Enter Vehicle Name</td>
				<td>	<input type="text" id="vehicleName" name="vehicleName" placeholder ="Enter Vehicle Name" required>
					</td>
</tr>
<tr>
<td>
		
				Enter Vehicle State</td>
				<td>	<input type="text" id="vehicleState" name="vehicleState" placeholder ="Enter Vehicle State" required>
					</td>
</tr>
<tr>
<td>
		
				Enter Vehicle Country</td>
				<td>	<input type="text" id="vehicleCountry" name="vehicleCountry" placeholder ="Enter Vehicle Country" required>
					</td>
</tr>

<tr>
<td>

				
 <button type="submit" value="Submit" id="submitbtn" onclick= "validate()" >Submit</button>  <br>
 
 </td>

 
<td>

				
<input type="button" value="Back" onclick="history.back()">  <span class="glyphicon glyphicon-menu-left"> </span>  </button>
 
       
 </td>
 </tr>
 </table>

</form>




</body>
 <script>
 
 
 
 $('form').validate({
	   
	    rules:{
	       
	    	vehicleName:{
	        	required:true,
	            alphanumeric:true,
	           
	           
	        },
	       
	        vehicleState:{
	            required:true,
	            lettersonly:true,
	            
	        },
	        vehicleCountry: {
	            required: true,
	            lettersonly:true,
	            
	        }
	    }
	    });
	</script>  
</html>