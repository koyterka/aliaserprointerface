<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<div align="center">
<body style="background-color:#666699;">
<style>
<%@include file="/WEB-INF/mainStyle.css"%></style>
<h1><font face="helvetica" color="ffffff">Enter the recipe</font></h1>

	<form action="done">
		<table>
		<tr><td><input type="text" id="name" name="name" placeholder="Name..">
		<input type="checkbox" name="vege" value="true"><font face="helvetica" color="ffffff">Vegetarian</font><br></td>
		</tr>
		
		<tr>
		<td><textarea id="recipe" name="recipe" placeholder="Recipe.." style="height:300px; width:512px"></textarea><br></td>
		</tr>
		</table>

		<button class="mybutton" type="submit">Add</button>
	</form>
</body>
</div>
</html>