<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 기본 문법</title>
</head>
<body>
	<h2>JSP 기본 문법</h2>
	
	<!-- html 주석 -->
	
	<%-- jsp 주석 --%>
	
	<h2>1. 합계 구하기</h2>
	<%
		int sum = 0;
		for(int i =1; i<=10; i++){
			sum += i;
		}
	%>
	
	<h3>합계 : <%= sum %></h3>
	
	
	
	<% 
		//동물이름을 저장하는 리스트
		List<String> animalList = new ArrayList<>();
	
		animalList.add("dog");
		animalList.add("cat");
		animalList.add("lion");
		animalList.add("tiger");
	%>
	
	<h3>동물 이름</h3>
	<ul>
		<li><%= animalList.get(0) %></li>
		<li><%= animalList.get(1) %></li>
	</ul>
	
	
	<h2>메소드 만들기</h2>
	
	<%-- hello world를 리턴하는 메소드 --%>
	<%!
		public String getHelloWorld(){
			return "Hello World";
		}
	%>
	
	<h2><%= getHelloWorld() %></h2>
	
</body>
</html>