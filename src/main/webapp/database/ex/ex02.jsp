<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="common.MysqlService" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "SELECT * FROM `new_user`;";
		ResultSet resultSet = mysqlService.select(query);
		
	%>
	
	<table border=1>
		<thead>
			<tr>
                <th>name</th>
                <th>birthday</th>
                <th>email</th>
                <th></th>
            </tr>
		</thead>
		<tbody>
			<% while(resultSet.next()) { %>
            <tr>
                <td><%= resultSet.getString("name") %></td>
                <td><%= resultSet.getString("yyyymmdd") %></td>
                <td><%= resultSet.getString("email") %></td>
                <td><a href ="/db/user/delete?id=<%= resultSet.getInt("id") %>">삭제</td>
            </tr>
        <% } %>
		</tbody>
	</table>
	
	<a href="/database/ex/user_input.jsp">추가하기</a>
</body>
</html>