<html>
<div align="center">
<body style="background-color:#666699;">

<style>
<%@include file="/WEB-INF/mainStyle.css"%></style>

<h2><font face="helvetica" color="ffffff">Which recipe is correct?</font></h2>

	<form action="choose">
		<table>
		<tr>
		    <td><textarea rows="1" cols="50" name="n1"> <%=request.getAttribute("n1") %></textarea></td>
		    <td><textarea rows="1" cols="50" name="n2"><%=request.getAttribute("n2") %></textarea></td>
		</tr>
		<tr>
		    <td><textarea rows="10" cols="50" name="d1"><%=request.getAttribute("d1") %></textarea></td>
		    <td><textarea rows="10" cols="50" name="d2"><%=request.getAttribute("d2") %></textarea></td>
		</tr>
		</table>
		<button class="mybutton" type="submit" name=First, id=<%=request.getAttribute("id2") %>>First one</button>
		<button class="mybutton" type="submit" name=Second, id=<%=request.getAttribute("id1") %>>Second one</button>
	</form>
	
	
</body>
</div>
</html>