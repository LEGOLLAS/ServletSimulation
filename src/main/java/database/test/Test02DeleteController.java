package database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.MysqlService;

@WebServlet("/db/test02/delete")
public class Test02DeleteController extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "delete from `favorites` where `id` = "+ id;
		mysqlService.update(query);
		
		response.sendRedirect("/database/test/test02/test02.jsp");
	}
}
