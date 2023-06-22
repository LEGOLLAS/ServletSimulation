package com.myJava.url.test01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test04")
public class ServletTest04 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		
		String number1 = request.getParameter("num1");
		String number2 = request.getParameter("num2");
		
		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);
		
		out.println("{\"addition\": "+ (num1 + num2) + ",");
		out.println("\"subtraction\": "+ (num1 + num2) + ",");
		out.println("\"multiplication\": "+ (num1*num2) + ",");
		out.println("\"division\": "+ (num1/num2) + "}");
	}
}
