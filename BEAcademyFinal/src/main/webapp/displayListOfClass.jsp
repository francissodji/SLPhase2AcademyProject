
<%@page import="java.util.List" %>
<%@page import ="com.beans.Classes" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List of all Classes</h1>

	<div>
		<table border=1>
		
			<tr><th>Class Designation</th></tr>
			
			<% 
				List<Classes> aListOfAllClass = (List<Classes>)session.getAttribute("listOfAllClass");
				
			
				for(Classes aClass : aListOfAllClass)
				{
			%>
					<tr>
						<td><%=aClass.getDesignClasses()%></td>
					</tr>
			<%		
				}
			%>
		</table>
	</div>
	

</body>
</html>