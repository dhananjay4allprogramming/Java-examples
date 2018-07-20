package com.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class MessageAction extends ActionSupport{
	private String message;
	
	@Override
	public String  execute() {
		return "success";
	}
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
