
<%@taglib uri="http://www.springframework.org/tags/form" prefix="c"%>

<c:form modelAttribute="prod" enctype="multipart/form-data" method="POST">
	<table border="1" bgcolor="yellow" align="center">
		<tr>
			<td>product Id:</td>
			<td><c:input path="productId" /></td>
		</tr>

		<tr>
			<td>Product Name:</td>
			<td><c:input path="productName" /></td>
		</tr>

		<tr>
			<td>Product Image</td>
			<td><c:input type="file" path="productImage" /></td>
		</tr>

		<tr>
			<td>Product Description</td>
			<td><c:input type="file" path="productDesc" /></td>
		</tr>

		<tr>
			<td colspan="2"><input type=submit value=register /></td>
		</tr>
	</table>
</c:form>