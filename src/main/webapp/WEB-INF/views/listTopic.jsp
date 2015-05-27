<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="http://localhost:9090/resources/css/post.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
    <c:import url="menu.jsp" />
	<div class="content">
       <c:if test="${!empty topics}">
       	<table border="1" bgcolor="black" width="600px">
       		<tr
       				style="background-color: teal; color: white; text-align: center;"
       				height="40px">

       			<td>Name</td>
       			<td>Description</td>
       			<td>Edit</td>
       			<td>Delete</td>
       		</tr>
       		<c:forEach items="${topics}" var="topic">
       			<tr
       					style="background-color: white; color: black; text-align: center;"
       					height="30px">

       				<td><c:out value="${topic.name}" />
       				</td>
       				<td><c:out value="${topic.description}" />
       				</td>
       				<td><a href="editTopic?id=${topic.id}">Edit</a>
       				</td>
       				<td><a href="deleteTopic?id=${topic.id}">Delete</a>
       				</td>
       			</tr>
       		</c:forEach>
       	</table>
       </c:if>


       <a href="formTopic">Click Here to add new Topic</a>

	</div>
</body>
</html>