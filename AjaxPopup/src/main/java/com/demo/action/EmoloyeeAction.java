package com.demo.action;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.demo.DAO.EmployeeDAO;
import com.demo.beans.Employees;
import com.opensymphony.xwork2.ActionSupport;

public class EmoloyeeAction extends ActionSupport {
	private ArrayList<Employees> employeeList = new ArrayList<>();
	private ResultSet resultSet;
	private Employees employees;
	private String selected;
	
	@Override
	public String execute(){
		System.out.println("Employee Action Execute method start...");
		try {
			resultSet = new EmployeeDAO().fetchData();
			if (resultSet != null) {
				while (resultSet.next()) {
					employees = new Employees();
					employees.setEmployeeId(resultSet.getInt("emp_id"));
					employees.setEmployeeName(resultSet.getString("name"));
					employees.setEmployeeEmail(resultSet.getString("email"));
					employees.setEmployeeMobile(resultSet.getString("mobile"));
					employees.setEmployeePhone(resultSet.getString("phone"));
					employees.setEmployeeAddress(resultSet.getString("address"));
					employees.setEmployeeSignature(resultSet.getString("signature"));
					employees.setEmployeeCompanyId(resultSet.getString("company_id"));
					employees.setEmployeeStatusId(resultSet.getString("status_id"));
					employees.setEmployeeTypeName(resultSet.getString("type_name"));
					employees.setEmployeeNotification(resultSet.getString("last_name"));
					employees.setEmployeeNeedDailyReport(resultSet.getString("need_daily_report"));
					
					employeeList.add(employees);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Employee Action Execute method done...");
		System.out.println(employeeList);
		return "success";
	}

	/**
	 * @return the employeeList
	 */
	public ArrayList<Employees> getEmployeeList() {
		return employeeList;
	}

	/**
	 * @param employeeList
	 *            the employeeList to set
	 */
	public void setEmployeeList(ArrayList<Employees> employeeList) {
		this.employeeList = employeeList;
	}

	/**
	 * @return the resultSet
	 */
	public ResultSet getResultSet() {
		return resultSet;
	}

	/**
	 * @param resultSet
	 *            the resultSet to set
	 */
	public void setResultSet(ResultSet resultSet) {
		this.resultSet = resultSet;
	}

	/**
	 * @return the employees
	 */
	public Employees getEmployees() {
		return employees;
	}

	/**
	 * @param employees
	 *            the employees to set
	 */
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	/**
	 * @return the selected
	 */
	public String getSelected() {
		return selected;
	}

	/**
	 * @param selected the selected to set
	 */
	public void setSelected(String selected) {
		this.selected = selected;
	}
	
	

}
