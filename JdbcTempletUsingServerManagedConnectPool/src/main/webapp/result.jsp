<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
th {
	background: green;
	color: white;
}

td {
	background: red;
	color: silver;
}
</style>
</head>
<body>

	<div align="center">

		<table border="1">
			<c:choose>
				<c:when test="${not empty result}">
					<th>Employee Id</th>
					<th>Employee Name</th>
					<th>Employee Job</th>
					<th>Employee Sal</th>



					<c:forEach var="map" items="${result}">
						<tr align="center">
							<td><c:out value="${map.EID}"></c:out></td>
							<td><c:out value="${map.ENAME}"></c:out></td>
							<td><c:out value="${map.JOB}"></c:out></td>
							<td><c:out value="${map.SAL}"></c:out></td>
						</tr>



					</c:forEach>
		</table>

	</div>


	</c:when>

	<c:otherwise>

		<h3 style="color: red">No Employee found</h3>

	</c:otherwise>


	</c:choose>
</body>
</html>




