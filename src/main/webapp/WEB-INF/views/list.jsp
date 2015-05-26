<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="http://${pageContext.request.serverName}:${pageContext.request.serverPort}"
	   var="hostName"/>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Title of the document</title>
	<link href="${hostName}/resources/css/main.css"  rel="stylesheet">
</head>

<body>
<c:import var="data" url="nav.jsp"/>
<c:out value="${data}" escapeXml="false" />
<c:out value="${pageContext.request.locale}"  />

<br>
<div style="color: teal; font-size: 30px">Being Java Guys | User
	Details</div>

<c:if test="${!empty employeeList}">
	<table border="1" bgcolor="black" width="600px">
		<tr
				style="background-color: teal; color: white; text-align: center;"
				height="40px">

			<td>First Name</td>
			<td>Last Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<c:forEach items="${employeeList}" var="user">
			<tr
					style="background-color: white; color: black; text-align: center;"
					height="30px">

				<td><c:out value="${user.firstName}" />
				</td>
				<td><c:out value="${user.lastName}" />
				</td>
				<td><c:out value="${user.email}" />
				</td>
				<td><c:out value="${user.phone}" />
				</td>
				<td><a href="edit?id=${user.id}">Edit</a></td>
				<td><a href="delete?id=${user.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>


<a href="form">Click Here to add new User</a>
</body>

</html>
