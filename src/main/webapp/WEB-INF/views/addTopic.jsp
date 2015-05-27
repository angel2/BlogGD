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
<c:import url="menu.jsp" />

	<div class="content">
        <form:form id="topicForm" modelAttribute="topic" method="post" action="newTopic">
            <form:label path="name" >Name </form:label>
            <form:input path="name"/>
            <form:label path="description" >Description </form:label>
            <form:input path="description"/>
            <input type="submit" value="newTopic"/>
       	</form:form>
	</div>
</body>
</html>