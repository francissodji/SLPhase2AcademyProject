<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>GENEREL MENU</h1>
	
	<div>
		<div>
			<form action="<%=request.getContextPath()%>/ListClassSubject" method="get">
			<label for="listclsub">Edit List of Classes and Subjects :</label>
				<button type="submit" class="btn btn-primary">Edit</button>
			</form>
		</div>
		
		<div>
			<form action="<%=request.getContextPath()%>/DestinationAction" method="get">
				<label for="listDest">Edit List of Destination :</label>
				<button type="submit" class="btn btn-primary">Edit</button>
			</form>
		</div>
	</div>
</body>
</html>