<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03 입력</title>
</head>
<body>
	<form method="post" action="/jsp/ex/ex03.jsp" >
		<label>닉네임: </label> <input type="text" name="nickname">

		<label>강아지 <input type="radio" name="animal"></label>
		<label>고양이 <input type="radio" name="animal"></label>
		<label>사자 <input type="radio" name="animal"></label>
		
		<h3>좋아하는 과일을 선택하세요</h3>
		<select name="fruit">
			<option value="peach">복숭아</option>
			<option value="banana">바나나</option>
			<option value="berry">딸기</option>
			<option value="apple">사과</option>
			<option value="pear">배</option>
		</select>
		
		<h3>좋아하는 음식을 모두 고르세요</h3>
		<label>민트초코 <input type="checkbox" name="food" value="민초"></label>
		<label>하와이안피자 <input type="checkbox" name="food" value="파인애플피자"></label>
		<label>번데기 <input type="checkbox" name="food" value="번데기"></label>
		
		<button type="submit">전달</button>
	</form>
</body>
</html>