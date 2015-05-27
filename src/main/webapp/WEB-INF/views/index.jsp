<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link href="http://localhost:9090/resources/css/post.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>

	<div class="content">
        <c:forEach items="${postList}" var="post">

        <div class = "postDiv col-xs-6">
            <span class="imagePost col-xs-3">
                <img src="${post.frontImg}"/>
            </span>
            <span class = "textPost col-xs-9">
                <h1><a href="viewPost?id=${post.id}">${post.title}</a></h1>
            </span>
        </div>

        </c:forEach>

	</div>
</body>
</html>