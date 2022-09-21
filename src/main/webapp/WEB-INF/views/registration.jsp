<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Registration Form</title>
</head>
<body>
	<form:form action="store" method="post"
		modelAttribute="customerRequest" />
	<table>
		<tr>
			<td>FirstName</td>
			<td><form:input path="firstName" /></td>
		</tr>

		<tr>
			<td>lastName</td>
			<td><form:input path="lastName" /></td>
		</tr>

		<tr>
			<td>Email</td>
			<td><form:input type="email" path="email" /></td>
		</tr>

		<tr>
			<td>DOB</td>
			<td><form:input type="date" " path="dob" /></td>
		</tr>

		<tr>
			<td>Gender</td>
			<td><form:radiobutton path="gender" value="Male" label="Male" />
				<form:radiobutton path="gender" value="Female" label="Female" /> <form:radiobutton
					path="gender" value="Other" label="Other" /></td>
		</tr>


		<tr>
			<td>Hobbies</td>
			<td><form:checkbox path="hobbies" value="Art" label="Art" /> <form:checkbox
					path="hobbies" value="Chess" label="Chess" /> <form:checkbox
					path="hobbies" value="Dance" label="Dance" /> <form:checkbox
					path="hobbies" value="Music" label="Music" /></td>
		</tr>

		<tr>
			<td>Country</td>
			<td><form:select path="country">
					<form:option value="">Please select......</form:option>
					<form:options items="${countryList }" itemValue="code"
						itemLabel="name" />
				</form:select></td>
		</tr>
	</table>
	<input type="submit" value="Submit">
</body>
</html>