<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" />
<div class="container">
	<h1 style="color: red; text-align: center">Enter New Student
		Details</h1>
	<form:form modelAttribute="stud">
		<table border="2" align="center" class="table table-dark">
			<tr>
				<td>Enter Student Name</td>
				<td><form:input path="studName" /></td>
			</tr>

			<tr>
				<td>Enter School Name</td>
				<td><form:input path="schoolName" /></td>
			</tr>
			<tr>
				<td>Enter City</td>
				<td><form:input path="studAddrs" /></td>
			</tr>
			<tr>
				<td>Enter Parents Name</td>
				<td><form:input path="parentsName" /></td>
			</tr>
			<tr>
				<td>Enter Last Year Percentage</td>
				<td><form:input path="lastYearPercentage" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Register"></td>
			</tr>
		</table>
	</form:form>
</div>