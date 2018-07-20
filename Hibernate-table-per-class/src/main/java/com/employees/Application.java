package com.employees;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {

	public static void main(String[] args) {
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Devloper devloper =  new Devloper();
		devloper.setEmpId(101);
		devloper.setEmployeeName("Dhananjay");
		devloper.setDesiganation("tranee software engineer");
		devloper.setRole("FullStack devloper");
		
		Tester tester = new Tester();
		tester.setEmpId(102);
		tester.setEmployeeName("Shravni");
		tester.setDesiganation("junior tester");
		tester.setRole("manual tester");
		
		session.save(devloper);
		session.save(tester);
		transaction.commit();
		System.out.println("save successfully");

	}

}
