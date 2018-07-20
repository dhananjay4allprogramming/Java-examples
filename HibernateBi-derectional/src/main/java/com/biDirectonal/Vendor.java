package com.biDirectonal;

import java.util.Set;

public class Vendor {
	private Integer vendorId;
	private String vendorName;
	private String vendirAddress;
	private Set customers;
	/**
	 * @return the vendorId
	 */
	public Integer getVendorId() {
		return vendorId;
	}
	/**
	 * @param vendorId the vendorId to set
	 */
	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}
	/**
	 * @return the vendorName
	 */
	public String getVendorName() {
		return vendorName;
	}
	/**
	 * @param vendorName the vendorName to set
	 */
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	/**
	 * @return the vendirAddress
	 */
	public String getVendirAddress() {
		return vendirAddress;
	}
	/**
	 * @param vendirAddress the vendirAddress to set
	 */
	public void setVendirAddress(String vendirAddress) {
		this.vendirAddress = vendirAddress;
	}
	/**
	 * @return the customers
	 */
	public Set getCustomers() {
		return customers;
	}
	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(Set customers) {
		this.customers = customers;
	}
	
	
}
