
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


	<div>
		<table border=1>
		
			<tr><th>Class Designation</th></tr>
			
			<% 
				List<Classes> aListOfAllClass = (List<Classes>)session.getAttribute("ALLFLIGHTSPERDAY");
				
			
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