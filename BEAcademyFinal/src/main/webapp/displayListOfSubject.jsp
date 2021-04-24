<%@page import="java.util.List" %>
<%@page import="com.beans.Subject" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>List of all Subjects</h1>
	<div>

		<table border=1>
		
			<tr><th>Subject Designation</th></tr>
			
			<% 
				List<Subject> aListOfAllSubject = (List<Subject>)session.getAttribute("listOfAllSubject");
				
			
				for(Subject aSubject : aListOfAllSubject)
				{
			%>
					<tr>
						<td><%=aSubject.getDesignSubject()%></td>
					</tr>
			<%		
				}
			%>
		</table>
	</div>
</body>
</html>