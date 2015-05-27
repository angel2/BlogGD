<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link href="http://localhost:9090/resources/css/default.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src="http://localhost:9090/resources/js/jquery.sceditor.bbcode.min.js"></script>
<script src="http://localhost:9090/resources/js/save.js"></script>
<script>
			// Source: http://www.backalleycoder.com/2011/03/20/link-tag-css-stylesheet-load-event/
			var loadCSS = function(url, callback){
				var link = document.createElement('link');
				link.type = 'text/css';
				link.rel = 'stylesheet';
				link.href = url;
				link.id = 'theme-style';

				document.getElementsByTagName('head')[0].appendChild(link);

				var img = document.createElement('img');
				img.onerror = function(){
					if(callback) callback(link);
				}
				img.src = url;
			}

			$(document).ready(function() {
				var initEditor = function() {
					$("textarea").sceditor({
						plugins: 'xhtml',
						style: "http://localhost:9090/resources/css/jquery.sceditor.default.min.css "
					});
				};

				initEditor();
			});
		</script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<c:import url="menu.jsp" />

	<div class="content">
		<form:form id="postForm" modelAttribute="post" method="post" action="newPost">
            <form:label path="title">Titulo </form:label>
            <form:input path="title"/>
                    <form:label path="Topics_id">Choose a topic </form:label>
                    <form:input path="Topics_id"/>
              <!--      <form:select path="Topics_id">
                    	<form:options items="${topics}" />
                    </form:select>
-->
                    <form:label path="frontImg">frontImg </form:label>
                    <form:input path="frontImg"/>

                    ignorar<form:input path="contetPost" id="post" />

                    <form:hidden path="Users_id" value="1" />
                    <textarea id="bbcode" name="bbcode_field" style="height:300px;width:600px;"></textarea>

					<button onclick="save()">save</button>

               	</form:form>

	</div>
</body>
</html>