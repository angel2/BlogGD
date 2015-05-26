<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="http://${pageContext.request.localName}:${pageContext.request.localPort}"
       var="hostName"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title of the document</title>
    <link href="${hostName}/resources/css/main.css"  rel="stylesheet">
</head>

<body>
<c:import var="data" url="nav"/>
<c:out value="${data}" escapeXml="false" />

Content of the document......
</body>

</html>