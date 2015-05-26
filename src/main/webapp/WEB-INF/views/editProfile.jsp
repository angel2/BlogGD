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
        <form:form id="userForm" modelAttribute="user" method="post" action="updateUser">
            <form:label path="fullName" >Fullname </form:label>
            <form:input path="fullName" value="${userObject.fullName}" />
            <form:label path="email">Email </form:label>
            <form:input path="email" value="${userObject.email}"/>
            <form:label path="img">Image </form:label>
            <form:input path="img" value="${userObject.img}"/>
                            <!--<form:label path="password">new pass </form:label>
                            <form:input path="password"/>-->
            <form:label path="password">Password </form:label>
            <form:password path="password" value="${userObject.password}" />
            <form:hidden path="role" value="${userObject.role}" />
            <form:hidden path="id" value="${userObject.id}" />
            <input type="submit" value="editUser"/>
       	</form:form>

	</div>
</body>
</html>