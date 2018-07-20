package com.mantyToOne;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.hibernate.query.Query;

public class ManyToOne {
	

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Vendor vendor = new Vendor();
		vendor.setVendorId(101);
		vendor.setVendorName("Dhananjay panday");
		
		Customer customer = new Customer();
		customer.setCustomerId(201);
		customer.setCustomerName("raja ram");
		customer.setVendor(vendor);
		
		Customer customer2 = new Customer();
		customer2.setCustomerId(202);
		customer2.setCustomerName("rohit");
		customer2.setVendor(vendor);
		
		Customer customer3 = new Customer();
		customer3.setCustomerId(203);
		customer3.setCustomerName("mohit");
		customer3.setVendor(vendor);
		
		Transaction transaction = session.beginTransaction();
		// Save record into database
		/*session.save(customer);
		session.save(customer2);
		session.save(customer3);*/
		
		// select one object with parent  
		
		/*Customer customer4 = session.get(Customer.class, 201);
		System.out.println(customer4.getCustomerId() +" ---- "+customer4.getCustomerName());
		Vendor vendor2 = customer4.getVendor();
		System.out.println(vendor2.getVendorId()+" ----- "+vendor2.getVendorName());*/
		
		// Select all object with parent 
		
	/*	Query query = session.createQuery("from Customer c");
		List list = query.list();
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Customer custom = (Customer) iterator.next();
			System.out.println(custom.getCustomerId() +"----"+custom.getCustomerName());
			Vendor vendor2 = custom.getVendor();
			System.out.println(vendor2.getVendorId()+" ----- "+vendor2.getVendorName());
			System.out.println("------------------------------------------------------------------------------------");
		}*/
		Customer customer4 = session.get(Customer.class, 201);
		session.delete(customer4);
		transaction.commit();
		
		session.close();
		factory.close();
		
		System.out.println("many to one completed...");
	
	}
}
