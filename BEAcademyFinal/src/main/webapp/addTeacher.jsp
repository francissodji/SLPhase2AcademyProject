<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<H1>Set up a list of all Teacher</H1>
	
	<div>
		<form action="<%=request.getContextPath()%>/AddTeacher" method="post">
			<div>
				<label for="firstNam">First Name</label>
				<input type="text" name="firstNameTeach" required/>
			</div>
			
			<div>
				<label for="firstNam">Middle Name</label>
				<input type="text" name="middlNameTeach"/>
			</div>
			
			<div>
				<label for="firstNam">Last Name</label>
				<input type="text" name="lastNameTeach" required/>
			</div>
			
			<div>
				<button type="submit">Submit</button>
			</div>
		
		</form>
	
	</div>

</body>
</html>