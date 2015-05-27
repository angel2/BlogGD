<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
        <c:out value="${postObject.contetPost}" escapeXml="false" />

        <div class = "options">

            <a  class="btn-default" href="changePostStatus?status=1&idPost=${postObject.id}">Approve</button>
            <a class="btn-danger" href="changePostStatus?status=0&idPost=${postObject.id}">Disapprove</button>

        </div>

	</div>
</body>
</html>