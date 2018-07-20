package com.company;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class Application {
public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();		
		ResourceBundle bundle = ResourceBundle.getBundle("query");
		/*Employee employee = new Employee();
		employee.setSalary(13000.83);
		employee.setEmpName("dhananjay panday");
		Object obj = session.get(Employee.class, employee);
		Employee employee2 = (Employee)obj;
		System.out.println(employee2.getEmpName());*/
		
		//String hql = "select p from Employee p";
		//String hql = "from Employee";
		//String hql = "select p.empID,p.empName,p.address from Employee"; // gatting error.
		//String hql = "select  from Employee e where e.Employee=101";
		
		Query query = session.createQuery(bundle.getString("HQL"));
		List list = query.list();
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Employee o = (Employee)iterator.next();
			System.out.println(o);
		}
		transaction.commit();
	}
}