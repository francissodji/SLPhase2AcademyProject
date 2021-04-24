<%@ page import ="java.util.List" %>
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
<H1>List of Airliners</H1>
	<div>
		<table border=1>
	
			<tr>
				<th>Description</th>
				
			</tr>
			
			<% 
				
				List<Classes> allClassSubject = (List<Classes>)session.getAttribute("ALLCLASSANDSUBJECT"); 
	
	
				for(Classes aclasses : allClassSubject)
				{
			%>
					<tr>
						<td><%=aclasses.getDesignClasses()%></td>
	
						<td><%=aclasses.getSubjects()%></td>
					</tr>
			<%		
				}
			%>
		</table>
	</div>

</body>
</html>