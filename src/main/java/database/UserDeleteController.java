package database;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.MysqlService;

@WebServlet("/db/user/delete")
public class UserDeleteController extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// id 를 전달 받고 , 해당하는 행을 삭제하는 기능
		
		String id = request.getParameter("id");
				
		//MysqlService 인스턴스 생성 및 connect 디비 연결
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "delete from `new_user` where `id` = " + id + ";";
		
		mysqlService.update(query);
		
		response.sendRedirect("/database/ex/ex02.jsp");
		
		
	}
}
