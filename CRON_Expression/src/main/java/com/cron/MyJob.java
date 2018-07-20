package com.cron;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class MyJob implements Job {
	public void execute(JobExecutionContext context) {
		System.out.println("hello i am working.....");
	}
}
