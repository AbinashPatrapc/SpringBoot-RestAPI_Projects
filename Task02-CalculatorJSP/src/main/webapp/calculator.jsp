<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Calculator</title>
</head>
<body>
	<h2 style="color: green; text-align: center">Simple Calculator</h2>
	<table border="1" bgcolor="grey" align="center">
		<form method="post" action="calculator.jsp">
			<tr>
			<td>Enter First Number:</td>
				<td><input type="text" name="num1" placeholder="Enter number 1"
					required></td>
			</tr>
			<tr>
			<td>Enter Second Number:</td>
				<td><input type="text" name="num2" placeholder="Enter number 2"
					required></td>
			</tr>
			<tr>
			<td>Choose Operation:</td>
				<td><select name="operation">
						<option value="add">Addition (+)</option>
						<option value="subtract">Subtraction (-)</option>
						<option value="multiply">Multiplication (*)</option>
						<option value="divide">Division (/)</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Calculate"></td>
			</tr>
		</form>
	</table>


	<%
	if (request.getMethod().equalsIgnoreCase("POST")) {
		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		String operation = request.getParameter("operation");
		double result = 0;

		if (operation.equals("add")) {
			result = num1 + num2;
		} else if (operation.equals("subtract")) {
			result = num1 - num2;
		} else if (operation.equals("multiply")) {
			result = num1 * num2;
		} else if (operation.equals("divide")) {
			if (num2 != 0) {
		result = num1 / num2;
			} else {
		out.println("Cannot divide by zero!");
		return;
			}
		}
		out.println("<h3 style='color:green;text-align:center'>Result: " + result + "</h3>");
	}
	%>
</body>
</html>
