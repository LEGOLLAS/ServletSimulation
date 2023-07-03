package database;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.MysqlService;

@WebServlet("/db/user/insert")
public class UserInsertController extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		//이름 생년월일, 이메일, 자기소개 받고 insert
		
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		String email = request.getParameter("email");
		String introduce = request.getParameter("introduce");
		
		MysqlService mysqlService = MysqlService.getInstance();
		
		mysqlService.connect();
		
		String query = "insert into `new_user`\r\n"
				+ "(`name`, `yyyymmdd`, `email`, `introduce`)\r\n"
				+ "value \r\n"
				+ "('" + name + "', '" + birthday + "', '" + email + "', '" + introduce + "');";
		
		int count = mysqlService.update(query);
		//out.println("추가된 사용자" + count);
		
		
		//리스트 페이지 이동
		//리다이렉트
		response.sendRedirect("/database/ex/ex02.jsp");
	}
}
