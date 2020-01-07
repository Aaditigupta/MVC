<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/css/first.css">
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



<title>Home</title>
</head>
<body style="background-image: url('resources/images/second.jpg');background-repeat: no-repeat; background-size:100%;" >

	<hr>

	<h1 align="center"> Vehicle Registeration </h1>

	
<form align="center">

<button type="submit" class="button" id="user" value="user" name="user"  onclick=" form.action='user';"/ style="width:20%;height:30%";>Add User
<span class="glyphicon glyphicon-user"></span></button> <br><br>
<button type="submit"  class="button" id="vehicle" value="vehicle"  name="vehicle" onclick=" form.action='vehicle';"/ style="width:20%;height:30%";>Add Vehicle
</button>
<br>
<br>
<button type="submit" class="button" id="display" value="display"  name="display" onclick=" form.action='display';"/ style="width:20%;height:30%";>Display </button>


				
		</form>
		
	
		
</body>




</html>