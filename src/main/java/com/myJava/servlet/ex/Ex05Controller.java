package com.myJava.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex05")
public class Ex05Controller extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String price = request.getParameter("price");
		
		int cost = Integer.parseInt(price);
		
		out.println("<html><head><title>주문</title></head><body>");
		out.println("<h3>"+ address +"</h3>");
		
		if(address.contains("서울시")) {
			out.println("배달 불가 지역입니다.");
		}
		if(card == "신한카드") {
			out.println("결제 불가 카드입니다.");
		}
		
		out.println("<h3>결제금액 : " + cost + "원</h3>");
		out.println("</body></html>");
		
	}
}
