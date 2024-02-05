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
	<header>
		<h1 style="color: red; text-align: center">Student Details</h1>
		<nav>
			<a href="./">Home</a> <a href="register">Add New Student</a> <a href="#">Services</a> <a
				href="#">Contact</a>
		</nav>
	</header>

	<p:choose>
		<p:when test="${!empty List}">
			<hr border-top=3px>
			<table width="1000" border="2" align="center" class="table">
				<tr class="table-dark">
					<th>Student RollNo</th>
					<th>Student Name</th>
					<th>School Name</th>
					<th>Address</th>
					<th>Parents Name</th>
					<th>Last Year Percentage</th>
					<th>Operation</th>
				</tr>

				<p:forEach var="stud" items="${List}">
					<tr class="table-info">
						<td>${stud.studRollNo}</td>
						<td>${stud.studName}</td>
						<td>${stud.schoolName}</td>
						<td>${stud.studAddrs}</td>
						<td>${stud.parentsName}</td>
						<td>${stud.lastYearPercentage}</td>

						<td><a href="edit?rollNo=${stud.studRollNo}"><img
								src="images/edit.png" height="50" width="50" /></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a onclick="confirm('Do You Really Want to Delete ?')"
							href="delete?rollNo=${stud.studRollNo}"><img alt="Delete Image"
								src="images/delete.png" height="50" width="50" /></a></td>
					</tr>
				</p:forEach>
			</table>
		</p:when>
		<p:otherwise>
			<h1 style="color: red; text-align: center">Record Not Found</h1>
		</p:otherwise>
	</p:choose>

	<p:if test="${!empty resultMsg}">
		<h2 style="color: green; text-align: center">${resultMsg}</h2>
	</p:if>
	
</div>