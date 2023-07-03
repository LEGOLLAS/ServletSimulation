package database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.MysqlService;

@WebServlet("/db/test02/insert")
public class Test02InsertController extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		MysqlService mysqlService = MysqlService.getInstance();
		
		mysqlService.connect();
		
		String query = "insert into `favorites`\r\n"
				+ "(`name`, `address`)\r\n"
				+ "value\r\n"
				+ "('" + name + "', '" + address + "');";
		
		mysqlService.update(query);
		
		response.sendRedirect("/database/test/test02/test02.jsp");
	}
}
