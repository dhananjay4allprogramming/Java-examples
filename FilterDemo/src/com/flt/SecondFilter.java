package com.flt;

import java.io.IOException;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtProcessing;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class SecondFilter implements Filter {
	public void destroy() {
		System.out.println("second filter is destroied "+new DateTimeAtProcessing(new Date()));
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.getWriter().println("This is second filter *************************2222222222222222222*********");
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("second filter is initiated..."+new DateTimeAtProcessing(new Date()));
	}

}
