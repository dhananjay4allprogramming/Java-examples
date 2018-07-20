package com.biDirectonal;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BiDirectionalApp {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session =sessionFactory.openSession();
		Vendor vendor = new Vendor();
		vendor.setVendorId(101);
		vendor.setVendorName("Dhananjay panday");
		vendor.setVendirAddress("patna");
		
		
		
		Customer customer = new Customer();
		customer.setCustomerId(201);
		customer.setCustomerName("rajaram");
		customer.setCustomerAddress("bihar");
		
		Customer customer1 = new Customer();
		customer1.setCustomerId(202);
		customer1.setCustomerName("govind");
		customer1.setCustomerAddress("mathura");
		
		Customer customer2 = new Customer();
		customer2.setCustomerId(203);
		customer2.setCustomerName("Krishan");
		customer2.setCustomerAddress("uttar pradesh");
		
		
		//one to many 
		
		Set set = new HashSet();
		set.add(customer);
		set.add(customer1);
		set.add(customer2);
		
		vendor.setCustomers(set);
		
		//many to one
		
		customer.setPerantObjecct(vendor);
		customer1.setPerantObjecct(vendor);
		customer2.setPerantObjecct(vendor);
		
		Transaction transaction = session.beginTransaction();
		
		//session.save(vendor);
		session.save(customer);
		
		transaction.commit();
		
		session.close();
		sessionFactory.close();
	}
}	
