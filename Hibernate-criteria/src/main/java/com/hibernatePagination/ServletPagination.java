package com.hibernatePagination;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import com.criteria.Employee;


@WebServlet("/ServletPagination")
public class ServletPagination extends HttpServlet {
	private SessionFactory sessionFactory;
	@Override
	public void init() throws ServletException {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("session factory created...");
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		Session session = sessionFactory.openSession();
		int page = 0;
		int total = 0;
		int perPage = 4;
		String sPage = request.getParameter("page");
		if(sPage == null) {
			page = 1;
		}else {
			page = Integer.parseInt(sPage);
		}
		 int s = (page * perPage) - total;
		 
		 Criteria criteria = session.createCriteria(Employee.class);
		 criteria.setFirstResult(s);
		 criteria.setMaxResults(perPage);
		 List list = criteria.list();
		 Iterator iterator = list.iterator();
		 PrintWriter out = response.getWriter();
		 out.println("<table border=1>");
		 out.println("<tr>");
		 out.println("<th>First Name</th><th>Last Name</th><th>Job Title</th>");
		 out.println("</tr>");
		 while(iterator.hasNext()) {
			 Employee emp = (Employee)iterator.next();
			 out.println("<tr>");
			 out.println("<td>"+emp.getFirstName()+"</td>");
			 out.println("<td>"+emp.getLastName()+"</td>");
			 out.println("<td>"+emp.getJobTitle()+"</td>");
			 out.println("</tr>");
		 }
		 out.println("</table>");
		 
		 Criteria criteria2 = session.createCriteria(Employee.class);
		 criteria2.setProjection(Projections.rowCount());
		 List list2 = criteria2.list();
		 
		 Iterator iterator2 = list2.iterator();
		 if(iterator2.hasNext()) {
			 Object size = iterator2.next();
			 total = Integer.parseInt(size.toString());
		 }
		 int noOfPages = total/perPage;
		 if(total > (perPage*total)) {
			 noOfPages +=1;
		 }
		 
		 for(int i=0 ; i<noOfPages;i++) {
			 String myurl = "ServletPagination?page="+i;
			 out.println("<a href="+myurl+">"+i+"</a>");
		 }
		 session.close();
		 out.close();
	}
	
	@Override
	public void destroy() {
		System.out.println("Object are closed....");
		sessionFactory.close();
	}
}
