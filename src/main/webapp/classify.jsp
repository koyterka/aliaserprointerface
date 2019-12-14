<html>
<div align="center">
<body style="background-color:#666699;">

<style>
<%@include file="/WEB-INF/mainStyle.css"%></style>

<h2><font face="helvetica" color="ffffff">Decide whether the descriptions are the same:</font></h2>

		<table>
		<tr>
		    <td><textarea rows="1" cols="50" name="n1"> <%=request.getAttribute("n1") %></textarea></td>
		    <td><textarea rows="1" cols="50" name="n2"><%=request.getAttribute("n2") %></textarea></td>
		</tr>
		<tr>
		    <td><textarea rows="10" cols="50" name="d1"><%=request.getAttribute("d1") %></textarea></td>
		    <td><textarea rows="10" cols="50" name="d2"><%=request.getAttribute("d2") %></textarea></td>
		</tr>
		
		<tr>
		<td>
		
		<form action="same">
		<button class="mybutton" type="submit" id1=<%=request.getAttribute("id1") %>
		id2=<%=request.getAttribute("id2") %>>Same</button>
	</form>
		</td>
		
		
		<td>
		<form action="diff">
		<button class="mybutton" type="submit" id1=<%=request.getAttribute("id1") %>
		id2=<%=request.getAttribute("id2") %>>Different</button>
	</form>
		</td>
		</tr>
		
		</table>

	
	<form action="goback">
	<button class="mybutton" type="submit" name="goback", value="goback">Main page</button>
	</form>
	
</body>
</div>
</html>
