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


public class FirstFilter implements Filter {
	
	public void destroy() {
		System.out.println("filter is destroied "+new DateTimeAtProcessing(new Date()));
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			response.getWriter().println("this is filter "+new DateTimeAtProcessing(new Date()));
			chain.doFilter(request, response);
	}
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("filter is initiated..."+new DateTimeAtProcessing(new Date()));
	}

}
