<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>GENERAL MENU</h1>
	
	<div>
		<div>
			<a href="<%=request.getContextPath()%>/addTeacher.jsp">Set up a master list of all the teachers</a>
			<!--<form action="<%=request.getContextPath()%>/AddTeacher" method="post">-->
			<!--<label for="listclsub">Edit List of Classes and Subjects :</label>-->
			<!--	<button type="submit" class="btn btn-primary">Edit</button>-->
			<!--</form>-->
		</div>
		
		<div>
			<form action="<%=request.getContextPath()%>/ListClasses" method="get">
				<label for="listClass">Edit List of Classes :</label>
				<button type="submit" class="btn btn-primary">Edit</button>
			</form>
		</div>
		
		<div>
			<form action="<%=request.getContextPath()%>/ListSubject" method="get">
				<label for="listSubj">Edit List of Subject :</label>
				<button type="submit" class="btn btn-primary">Edit</button>
			</form>
		</div>
		
		<div>
			<form action="<%=request.getContextPath()%>/ListTeacher" method="get">
				<label for="listTeach">Edit List of Teacher :</label>
				<button type="submit" class="btn btn-primary">Edit</button>
			</form>
		</div>
	</div>
</body>
</html>