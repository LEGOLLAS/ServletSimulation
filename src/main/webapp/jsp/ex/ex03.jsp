<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>post method</title>
</head>
<body>
	<%
		String nickname = request.getParameter("nickname");
		String animal = request.getParameter("animal");
		String fruit = request.getParameter("fruit");
		
		//전달받은 값이 여러개라도 문제 없음
		String[] foodArray = request.getParameterValues("food");
		
		//민초 번데기
		String foodString = "";
		for(int i=0; i<foodArray.length; i++){
			foodString += foodArray[i];
		}
	%>
	
	<h3><%= nickname %></h3>
	<h3><%= animal %></h3>
	<h3><%= fruit %></h3>
	<h3><%= foodString %></h3>
</body>
</html>