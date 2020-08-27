<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
First Name:<form:input path="firstName" />
		<br>
		<br>
Last Name:<form:input path="lastName" />
		<br></br>
		
Country:<form:select path="country">
			<form:options items="${student.countries}" />
		</form:select>
		<br>
		<br>
Select your favorite Programming Language:
<br>
		<br>

	Java<form:radiobutton path="favLang" value="Java" />
	C++<form:radiobutton path="favLang" value="C++" />
	Python<form:radiobutton path="favLang" value="Python" />
	JavaScript<form:radiobutton path="favLang" value="JavaScript" />
		<br>
		<br>
Select your favorite Operating System:
<br>
		<br>
Windows<form:checkbox path="os" value="Windows" />
Linux<form:checkbox path="os" value="Linux" />
IOS<form:checkbox path="os" value="IOS" />

		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>

</body>
</html>