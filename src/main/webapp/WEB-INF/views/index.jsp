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
    <c:import url="header.jsp" />
	<div class="content">
        <c:forEach items="${postList}" var="post">
                <div class = "postDiv col-xs-6">
                    <div class="imagePost col-xs-5">
                        <img class="imgPost" src="${post.frontImg}"/>
                    </div>
                    <div class = "textPost col-xs-7">
                        <h1><a href="viewPost?id=${post.id}">${post.title}</a></h1>
                    </div>
                </div>
        </c:forEach>

	</div>
</body>
</html>