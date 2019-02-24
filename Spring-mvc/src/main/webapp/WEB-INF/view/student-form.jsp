<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName"/>
			<br><br>
			Last Name: <form:input path="lastName"/>
			<br><br>
			Country:
			<form:select path="country">
				<form:options items="${student.countryOptions}" />
			</form:select>
			<br><br>
			Favorite programming Language:
			C#:<form:radiobutton path="favoriteLanguage" value="C#"/>
			C++#:<form:radiobutton path="favoriteLanguage" value="C++"/>
			C#:<form:radiobutton path="favoriteLanguage" value="C"/>
			Java#:<form:radiobutton path="favoriteLanguage" value="Java"/>
			<br><br>
			Which Operating Systems:
			Windows: <form:checkbox path="operatingSytems" value="Windows"/>
			MacOs: <form:checkbox path="operatingSytems" value="MacOs"/>
			Linux: <form:checkbox path="operatingSytems" value="Linux"/>
			<br><br>
			<input type="submit" value="submit"/>
		</form:form>

	</body>
</html>
