package com.college.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.college.students.Student;

public class Application {
	public static void main(String[] args) {
		Student dhananjay = new Student();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of student \n");
		dhananjay.setName(scanner.next());
		System.out.println("Enter the Fee of Student \n");
		dhananjay.setFee(scanner.nextDouble());
		System.out.println("Enter the Address of student");
		dhananjay.setAddress(scanner.next());
	
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dhananjay);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Completed...");
	}
}
