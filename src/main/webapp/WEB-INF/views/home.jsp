<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<html>
<head>
<title>Home</title>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	var gu = ['강남구', '영등포구', '중구']
	
	$.each(gu, function(index, data) {
			$.ajax({
				url: "api.do",
				dataType: "json",
				type: "GET",
				data : {a : data},
				success: function(json) {
					console.log(json.list[0]);
					$('#test2').append("<tr><td>"+data+"</td><td>"+json.list[0].o3Grade+"</td><td>"+json.list[0].pm25Grade+"</td></tr>");

					
					
		
					
					
				},
				error:function(data){
					alert("실패!");    	  
			    }
			});	
	});

});

</script>
</head>
<body>
	<h1>Hello world!</h1>
<table>
           			<thead>
	           		<tr>
	           			<th>구</th>
	           			<th>오존지수</th>
	           			<th>미세먼지</th>
           			</tr>
           			</thead>
           			<tbody id = "test2">
           			</tbody>
           		</table>
</body>
</html>