package com.demo;

import org.apache.log4j.Logger;

public class Log4jDemo2 {
	static Logger logger = Logger.getLogger(Log4jDemo2.class.getName());
	
	public static void main(String[] args) {
		logger.fatal("this is fatal from properties");
		logger.error("This is error from properties");
		logger.warn("This is warh from properties");
		logger.info("This is info fron properties");
		logger.debug("This is debug from properties");
		System.out.println("completed..");
	}
}
