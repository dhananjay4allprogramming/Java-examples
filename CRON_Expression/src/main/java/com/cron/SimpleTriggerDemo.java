package com.cron;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class SimpleTriggerDemo {

	public static void main(String[] args) throws SchedulerException {
		JobDetail job = JobBuilder.newJob(MyJob.class).withIdentity("testJob","group1").build();
		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("testTrigger", "group1").withSchedule(SimpleScheduleBuilder.simpleSchedule()
																				 .withIntervalInMilliseconds(5000).repeatForever()).build();
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.start();
		scheduler.scheduleJob(job,trigger);
		System.out.println("....................................@.........................................");

	}

}
