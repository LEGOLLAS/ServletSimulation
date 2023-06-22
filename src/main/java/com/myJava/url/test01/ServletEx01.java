package com.myJava.url.test01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletEx01 extends HttpServlet {
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
        Date now = new Date();
        PrintWriter out1 = response.getWriter();
        out1.println(now);
    }
}
