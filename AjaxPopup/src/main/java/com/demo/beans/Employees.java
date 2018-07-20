package com.demo.beans;

public class Employees {
	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private String employeeMobile;
	private String employeePhone;
	private String employeeAddress;
	private String employeeSignature;
	private String employeeCompanyId;
	private String employeeStatusId;
	private String employeeTypeName;
	private String employeeNotification;
	private String employeeLastName;
	private String employeeNeedDailyReport;
	
	public Employees() {}
	
	public Employees(int employeeId, String employeeName, String employeeEmail, String employeeMobile,
			String employeePhone, String employeeAddress, String employeeSignature, String employeeCompanyId,
			String employeeStatusId, String employeeTypeName, String employeeNotification, String employeeLastName,
			String employeeNeedDailyReport) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.employeeMobile = employeeMobile;
		this.employeePhone = employeePhone;
		this.employeeAddress = employeeAddress;
		this.employeeSignature = employeeSignature;
		this.employeeCompanyId = employeeCompanyId;
		this.employeeStatusId = employeeStatusId;
		this.employeeTypeName = employeeTypeName;
		this.employeeNotification = employeeNotification;
		this.employeeLastName = employeeLastName;
		this.employeeNeedDailyReport = employeeNeedDailyReport;
	}


	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the employeeEmail
	 */
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	/**
	 * @param employeeEmail the employeeEmail to set
	 */
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	/**
	 * @return the employeeMobile
	 */
	public String getEmployeeMobile() {
		return employeeMobile;
	}
	/**
	 * @param employeeMobile the employeeMobile to set
	 */
	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	/**
	 * @return the employeePhone
	 */
	public String getEmployeePhone() {
		return employeePhone;
	}
	/**
	 * @param employeePhone the employeePhone to set
	 */
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}
	/**
	 * @return the employeeAddress
	 */
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	/**
	 * @param employeeAddress the employeeAddress to set
	 */
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	/**
	 * @return the employeeSignature
	 */
	public String getEmployeeSignature() {
		return employeeSignature;
	}
	/**
	 * @param employeeSignature the employeeSignature to set
	 */
	public void setEmployeeSignature(String employeeSignature) {
		this.employeeSignature = employeeSignature;
	}
	/**
	 * @return the employeeCompanyId
	 */
	public String getEmployeeCompanyId() {
		return employeeCompanyId;
	}
	/**
	 * @param employeeCompanyId the employeeCompanyId to set
	 */
	public void setEmployeeCompanyId(String employeeCompanyId) {
		this.employeeCompanyId = employeeCompanyId;
	}
	/**
	 * @return the employeeStatusId
	 */
	public String getEmployeeStatusId() {
		return employeeStatusId;
	}
	/**
	 * @param employeeStatusId the employeeStatusId to set
	 */
	public void setEmployeeStatusId(String employeeStatusId) {
		this.employeeStatusId = employeeStatusId;
	}
	/**
	 * @return the employeeTypeName
	 */
	public String getEmployeeTypeName() {
		return employeeTypeName;
	}
	/**
	 * @param employeeTypeName the employeeTypeName to set
	 */
	public void setEmployeeTypeName(String employeeTypeName) {
		this.employeeTypeName = employeeTypeName;
	}
	/**
	 * @return the employeeNotification
	 */
	public String getEmployeeNotification() {
		return employeeNotification;
	}
	/**
	 * @param employeeNotification the employeeNotification to set
	 */
	public void setEmployeeNotification(String employeeNotification) {
		this.employeeNotification = employeeNotification;
	}
	/**
	 * @return the employeeLastName
	 */
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	/**
	 * @param employeeLastName the employeeLastName to set
	 */
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	/**
	 * @return the employeeNeedDailyReport
	 */
	public String getEmployeeNeedDailyReport() {
		return employeeNeedDailyReport;
	}
	/**
	 * @param employeeNeedDailyReport the employeeNeedDailyReport to set
	 */
	public void setEmployeeNeedDailyReport(String employeeNeedDailyReport) {
		this.employeeNeedDailyReport = employeeNeedDailyReport;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeMobile=" + employeeMobile + ", employeePhone=" + employeePhone
				+ ", employeeAddress=" + employeeAddress + ", employeeSignature=" + employeeSignature
				+ ", employeeCompanyId=" + employeeCompanyId + ", employeeStatusId=" + employeeStatusId
				+ ", employeeTypeName=" + employeeTypeName + ", employeeNotification=" + employeeNotification
				+ ", employeeLastName=" + employeeLastName + ", employeeNeedDailyReport=" + employeeNeedDailyReport
				+ "]";
	}
	
	
}
