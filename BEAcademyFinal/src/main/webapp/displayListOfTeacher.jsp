<%@page import="java.util.List" %>
<%@page import ="com.beans.Teacher" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>List of all Teachers</h1>
<div>
		<table border=1>
		
			<tr>
				<th>First Name</th>
				<th>Middle Name</th>
				<th>Last Name</th>
			</tr>
			
			<% 
				List<Teacher> aListOfTeacher = (List<Teacher>)session.getAttribute("listOfTeacher");
				
			
				for(Teacher aTeacher : aListOfTeacher)
				{
			%>
					<tr>
						<td><%=aTeacher.getFirstNTeacher()%></td>

						<td><%=aTeacher.getMiddleNTeacher()%></td>

						<td><%=aTeacher.getLastNTeacher()%></td>
					</tr>
			<%		
				}
			%>
		</table>
	</div>
</body>
</html>