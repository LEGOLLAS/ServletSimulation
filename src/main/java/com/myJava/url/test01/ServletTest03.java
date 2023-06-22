package com.myJava.url.test01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
public class ServletTest03 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		
		String num = request.getParameter("num");
		int number = Integer.parseInt(num);
		out.println("<html><head><title>구구단</title></head><body><ul>");
				
		for(int i=1; i<10; i++) {
			out.println("<li><strong>" + num + " X " + i + " = " + (number * i) +"</strong></li>");
		}
		
		out.println("</ul></body></html>");
	}
}	
