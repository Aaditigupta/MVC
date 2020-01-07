<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
	integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
	crossorigin="anonymous"></script>

<title>Insert User</title>

</head>
<body  style="background-color: coral; background-size:100%;">
	<form action="adduser" method="post" class="form">

		<h2 align="center" style="font-size: 35px;">Insert Customer Detail</h2>
		<table align="center" style="font-size: 15px;">
			<tr>
				<td>Enter User Name</td>
				<td><input type="text" id="userName" name="userName"
					placeholder="Enter User Name"  style="font-size: 15px;" required></td>
			</tr>
			<tr><td></td></tr>
			<tr><td></td></tr>
			
			
			
			<tr>
				<td>


					<button type="submit" style="font-size: 15px;" value="Submit">Submit</button> <br>
				</td>
			
			 
<td>

				
 <span class="glyphicon glyphicon-menu-left"> <input type="button"  style="font-size: 15px;" value="Back" onclick="history.back()"></span>  </button>
 
 </td>
 </tr>
		</table>

	</form>
	



</body>
 <script>
 $('form').validate({
	   
	    rules:{
	       
	        userName:{
	            required:true,
	            lettersonly:true,
	           
	        }
	       
	       
	    }
	    });
	</script>  
</html>