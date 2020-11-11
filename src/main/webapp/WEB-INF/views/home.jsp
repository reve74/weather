<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
	<title>Home</title>
<script type="text/javascript"	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>		
<script type="text/javascript">

$(document).ready(function() {
	
	$.ajax({
		url: "/weather/api.do",
		dataType: "json",
		type: "GET",
		async: "false",
		success: function(aaa) {
			console.log(aaa);
		}
	});
	
	
});

</script>	
</head>
<body>
<h1>
	Hello world!  
</h1>

	

</body>
</html>
