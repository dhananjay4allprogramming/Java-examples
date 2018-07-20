package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class EmployeeTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Criteria criteria =  session.createCriteria(Employee.class);
		//criteria.add(Restrictions.eq("officeCode", "1"));
		//criteria.add(Restrictions.lt("employeeNumber", 1500));
		//criteria.add(Restrictions.le("employeeNumber", 1450));
		//criteria.add(Restrictions.gt("employeeNumber", 1400));
		//criteria.add(Restrictions.ge("employeeNumber", 1401));
		//criteria.add(Restrictions.like("firstName", "%an%"));
		//criteria.add(Restrictions.between("employeeNumber", 1400, 1600));
		
		//criteria.add(Restrictions.isNull("extension"));
		//criteria.add(Restrictions.isNotNull("extension"));
		//criteria.add(Restrictions.isEmpty("extension"));
		//criteria.add(Restrictions.isNotEmpty("extension"));
		/*Criterion criterion = Restrictions.le("employeeNumber", 1500);
		criteria.add(criterion);
		criteria.addOrder(Order.desc("firstName"));*/
		//criteria.add(Restrictions.or(Restrictions.lt("employeeNumber", 1100),Restrictions.like("firstName", "%an%"), Restrictions.gt("employeeNumber",1500)));
		
		/*projection demo*/
		/*Projection projection = Projections.property("firstName");
		Projection projection2 = Projections.property("lastName");
		criteria.setProjection(projection);
		criteria.setProjection(projection2);*/
		
		/*projection list */
		
		/*Projection projection =Projections.property("firstName");
		Projection projection2 = Projections.property("lastName");
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(projection);
		projectionList.add(projection2);
		criteria.setProjection(projectionList);
		List list = criteria.list();
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object[] object = (Object[])iterator.next();
			System.out.println(object[0]+"-------------------------------"+object[1]);
		}*/
		
		/*native query*/
		/*SQLQuery sqlQuery = session.createSQLQuery("select * from employees").addEntity(Employee.class);
		List list = sqlQuery.list();
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Employee  employee  = (Employee) iterator.next();
			System.out.println(employee);
		}*/
		
		//Query query = session.getNamedQuery("getEmployees");
		//query.setParameter("name", new String("Dhananjay"));
		Query query = session.getNamedQuery("naticeSQLQuery");
		List list = query.list();
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object[] obj = (Object[])iterator.next();
			System.out.println(obj[0]+"========"+obj[1]+"========"+obj[2]+"========"+obj[3]+"========"+obj[4]+"========"+obj[5]);
		}
		System.out.println(list);
		session.close();
		sessionFactory.close();
	}
}
