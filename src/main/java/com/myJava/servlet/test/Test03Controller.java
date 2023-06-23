package com.myJava.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/testPost")
public class Test03Controller extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		
		out.println("<html><head><title>apply</title></head><body>");
		out.println(name + "님의 지원이 완료되었습니다.");
		out.println("<br>");
		out.println("지원내용");
		out.println(content);
		out.println("</body></html>");
	}
}
