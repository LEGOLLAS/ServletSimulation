package com.myJava.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex03")
public class Ex03Controller extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		
		String yearString = birthday.substring(0,4);
		int year = Integer.parseInt(yearString);
		int age = 2023 - year + 1;
		
//		out.println("<html><head><title>ex03</title></head><body>");
//		out.println("<table border=1><tr><td>이름</td><td>" + name + "</td></tr>");
//		out.println("<tr><td>나이</td><td>" + age + "</td></tr></table></body></html>");
		
		
		// response에 데이터 담기
		out.println("{\"name\" : \""+ name + "\", \"age\":" + age + "}");
	}
}
