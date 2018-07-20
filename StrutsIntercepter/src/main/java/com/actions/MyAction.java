package com.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyAction {
	private String message;
	private ArrayList country = new ArrayList();
	private HashMap<String, String> phones = new HashMap<>();
	private ArrayList list1 = new ArrayList();
	private ArrayList list2 = new ArrayList();
	private ArrayList list3 = new ArrayList();
	
	/**
	 * @return the country
	 */
	public ArrayList<String> getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public String sayWelcome() {
		message = "welcome "+message;
		country.add("India");
		country.add("America");
		country.add("japan");
		country.add("England");
		
		phones.put("Dhananjay", "9458001878");
		phones.put("Niranjay", "8877567899");
		phones.put("Ranjan", "8987567899");
		phones.put("Jalal", "7788567899");
		phones.put("Pratush", "8977567899");
		country.add(phones);
		
		list1.add("1");
		list1.add("2");
		list1.add("3");
		
		list2.add("a");
		list2.add("b");
		list2.add("c");
		
		list3.add("A");
		list3.add("B");
		list3.add("C");
		
		return "success";
	}

	/**
	 * @return the phones
	 */
	public HashMap<String, String> getPhones() {
		return phones;
	}

	/**
	 * @return the list1
	 */
	public ArrayList getList1() {
		return list1;
	}

	/**
	 * @param list1 the list1 to set
	 */
	public void setList1(ArrayList list1) {
		this.list1 = list1;
	}

	/**
	 * @return the list2
	 */
	public ArrayList getList2() {
		return list2;
	}

	/**
	 * @param list2 the list2 to set
	 */
	public void setList2(ArrayList list2) {
		this.list2 = list2;
	}

	/**
	 * @return the list3
	 */
	public ArrayList getList3() {
		return list3;
	}

	/**
	 * @param list3 the list3 to set
	 */
	public void setList3(ArrayList list3) {
		this.list3 = list3;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(ArrayList country) {
		this.country = country;
	}

	/**
	 * @param phones the phones to set
	 */
	public void setPhones(HashMap<String, String> phones) {
		this.phones = phones;
	}
}
