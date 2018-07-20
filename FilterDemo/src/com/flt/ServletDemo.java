package com.flt;

import java.io.IOException;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtProcessing;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("hey i am servlet..."+new DateTimeAtProcessing(new Date()));
	}
}
