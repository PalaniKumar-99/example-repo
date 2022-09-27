<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Registration Form</title>
</head>
<body>
	<form:form action="store" method="post"
		modelAttribute="customerRequest" >
	<table>
		<tr>
			<td>FirstName</td>
			<td><form:input path="firstName" /></td>
			<td><font  color="red"><form:errors path="firstName" /></font></td>
		</tr>

		<tr>
			<td>lastName</td>
			<td><form:input path="lastName" /></td>
			<td><font  color="red"><form:errors path="lastName" /></font></td>
		</tr>

		<tr>
			<td>Email</td>
			<td><form:input type="email" path="email" /></td>
			<td><font  color="red"><form:errors path="email" /></font></td>
		</tr>

		<tr>
			<td>DOB</td>
			<td><form:input type="date"  path="dob" /></td>
			<td><font  color="red"><form:errors path="dob" /></font></td>
		</tr>

		<tr>
			<td>Gender</td>
			<td><form:radiobutton path="gender" value="Male" label="Male" />
				<form:radiobutton path="gender" value="Female" label="Female" /> <form:radiobutton
					path="gender" value="Other" label="Other" /></td>
					<td><font  color="red"><form:errors path="gender" /></font></td>
		</tr>


		<tr>
			<td>Hobbies</td>
			<td><form:checkbox path="hobbies" value="Art" label="Art" /> <form:checkbox
					path="hobbies" value="Chess" label="Chess" /> <form:checkbox
					path="hobbies" value="Dance" label="Dance" /> <form:checkbox
					path="hobbies" value="Music" label="Music" /></td>
					<td><font  color="red"><form:errors path="hobbies" /></font></td>
		</tr>

		<tr>
			<td>Country</td>
			<td><form:select path="country">
					<form:option value="">Please select......</form:option>
					<form:options items="${customerRequest.countryList }" itemValue="code"
						itemLabel="name" />
				</form:select></td>
				<td><font  color="red"><form:errors path="country" /></font></td>
		</tr>
	</table>
	
	<input type="submit" value="Submit">
	</form:form>
</body>
</html>