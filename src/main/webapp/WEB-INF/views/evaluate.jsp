<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<c:import url="menu.jsp"></c:import>

	<div class="content">
        <c:if test="${!empty postList}">
        	<table border="1" bgcolor="black" width="600px">
        		<tr
        				style="background-color: teal; color: white; text-align: center;"
        				height="40px">

        			<td>Title</td>
        			<td>Status</td>
        			<td>Date</td>
        			<td>Action</td>
        		</tr>
        		<c:forEach items="${postList}" var="post">
        			<tr
        					style="background-color: white; color: black; text-align: center;"
        					height="30px">

        				<td><c:out value="${post.title}" />
        				</td>
        				<td><c:out value="${post.status}" />
                        </td>
        				<td><c:out value="${post.date}" /></td>
        				<td><a href="evaluatePost?id=${post.id}">Show</a></td>
        			</tr>
        		</c:forEach>
        	</table>
        </c:if>

	</div>
</body>
</html>