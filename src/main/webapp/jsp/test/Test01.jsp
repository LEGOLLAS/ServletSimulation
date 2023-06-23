<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP TEST01</title>
</head>
<body>
	<h2>1. 점수들의 평균 구하기</h2>
	
	<%
		int[] scores = {80, 90, 100, 95, 80};
	
		int sum = 0;
		for(int score : scores){
			sum += score;
		}
		
		double avg = sum / 5;
	%>
	
	<h3>평균 : <%= avg %></h3>
	
	
	
	<h2>2. 채점결과</h2>
	<%
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	
		int grade = 0;
		for(String score : scoreList){
			if(score == "O"){
				grade += 10;
			}
		}
	%>
	
	<h3>채점결과 : <%= grade %></h3>
	
</body>
</html>