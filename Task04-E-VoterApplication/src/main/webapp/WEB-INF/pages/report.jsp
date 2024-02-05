<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p"%>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" />
<div class="container">

	<style>
/* Some basic styling for the header */
header {
	background-color: #465;
	color: #fff;
	padding: 10px;
	text-align: center;
}

nav {
	display: flex;
	justify-content: space-around;
	padding: 5px 0;
}

nav a {
	text-decoration: none;
	color: #fff;
	padding: 0 10px;
}
</style>
	<p:choose>
		<p:when test="${!empty List}">
			<hr border-top=3px>
			<table width="1000" border="2" align="center" class="table">
				<tr class="table-dark">
					<th>Voter ID</th>
					<th>Voter Name</th>
					<th>Voter Date Of Birth</th>
					<th>Voter Age</th>
					<th>Voter Residing City</th>
					<th>Voter Nationality</th>
					<th>Voter Residing State</th>
				</tr>

				<p:forEach var="vote" items="${List}">
					<tr class="table-info">
						<td>${vote.voterId}</td>
						<td>${vote.voterName}</td>
						<td>${vote.Dob}</td>
						<td>${vote.age}</td>
						<td>${vote.voterCity}</td>
						<td>${vote.Nationality}</td>
						<td>${vote.state}</td>
					</tr>
				</p:forEach>
			</table>
		</p:when>
		<p:otherwise>
			<h1 style="color: red; text-align: center">Record Not Found</h1>
		</p:otherwise>
	</p:choose>
</div>