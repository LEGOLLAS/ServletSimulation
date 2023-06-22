package com.myJava.url.test01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest01 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 M월 d일");
		String formatDate = formatter.format(now);
		
		PrintWriter out = response.getWriter();
		out.println("오늘의 날짜는 " + formatDate);
	}
}
