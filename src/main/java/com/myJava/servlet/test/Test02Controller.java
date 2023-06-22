package com.myJava.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test02")
public class Test02Controller extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest reqeust, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println(
				"<html>"
				+ "<head>"
				+ "<title>"
				+ "리스트 출력"
				+ "</title>"
				+ "</head>"
				+ "<body>"
				+ "<ul>"
				);
		
		for(int i =1; i<=30; i++) {
			out.println("<li><strong>"+ i + " 번째 리스트"+ "</strong></li>");
		}
		
		out.println(
				"</ul>"
				+ "</body>"
				+ "</html>"
				);
	}
}
