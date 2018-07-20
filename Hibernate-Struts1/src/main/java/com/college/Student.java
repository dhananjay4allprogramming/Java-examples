package com.college;

/**
 * @author dhananjayp
 *
 */
public class Student {
	Integer studentID;
	String studentName;
	String studentAddress;
	Double studentFee;

	public Student() {
	}

	public Student(String studentName, String studentAddress, Double studentFee) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentFee = studentFee;
	}

	/**
	 * @return the studentID
	 */
	public Integer getStudentID() {
		return studentID;
	}

	/**
	 * @param studentID
	 *            the studentID to set
	 */
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName
	 *            the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the studentAddress
	 */
	public String getStudentAddress() {
		return studentAddress;
	}

	/**
	 * @param studentAddress
	 *            the studentAddress to set
	 */
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	/**
	 * @return the studentFee
	 */
	public Double getStudentFee() {
		return studentFee;
	}

	/**
	 * @param studentFee
	 *            the studentFee to set
	 */
	public void setStudentFee(Double studentFee) {
		this.studentFee = studentFee;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentFee=" + studentFee + "]";
	}

}
