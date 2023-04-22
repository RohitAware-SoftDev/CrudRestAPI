<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management</title>
<style type="text/css">
fieldset table {
	margin: auto;
	text-align: left;
}
fieldset {
	margin: 15px 520px;
	text-align: center;
}
legend {
	color: white;
	background-color: #333;
}
ul {
	list-style-type: none;
	background-color: black;
	overflow: hidden;
	background-color: #333;
}
li {
	float: right; 
}
li a {
	display: block;
	margin : 0px 3px;
	padding: 15px;
/* 	text-decoration: none; */
	font-size: 1rem;
	text-transform: uppercase;
}
li a:hover {
	background-color: #222;
}
</style>
</head>
<body>
	<ul>
		<li><a style="color: white;" href="./logout">Logout</a></li>
		<li><a style="color: white;" href="./search">Search</a></li>
		<li><a style="color: white;" href="./add">Add</a></li>
		<li><a style="color: white;" href="./update">Update</a></li>
		<li><a style="color: white;" href="./remove">Remove</a></li>
		<li><a style="color: white;" href="./home">Home</a></li>
	</ul>
</body>
</html>