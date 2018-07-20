package com.biDirectonal;

public class Customer {
	private Integer customerId;
	private String customerName;
	private String customerAddress;
	private Vendor perantObjecct;
	private Integer vendorIdFK;
	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}
	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	/**
	 * @return the perantObjecct
	 */
	public Vendor getPerantObjecct() {
		return perantObjecct;
	}
	/**
	 * @param perantObjecct the perantObjecct to set
	 */
	public void setPerantObjecct(Vendor perantObjecct) {
		this.perantObjecct = perantObjecct;
	}
	/**
	 * @return the venderIdFK
	 */
	public Integer getVendorIdFK() {
		return vendorIdFK;
	}
	/**
	 * @param venderIdFK the venderIdFK to set
	 */
	public void setVendorIdFK(Integer venderIdFK) {
		this.vendorIdFK = venderIdFK;
	}
	
	
}
