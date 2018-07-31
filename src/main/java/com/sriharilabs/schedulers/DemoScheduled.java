package com.sriharilabs.schedulers;

import java.util.Date;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableAsync
@EnableScheduling
@Component
public class DemoScheduled {

	
	@Scheduled(fixedRate = 200)
	@Async("taskScheduler1")
	//@Scheduled(cron = "*/1 * * * * *")
	public void show() {
		System.out.println(new Date()+ "tis executing...."+Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	@Scheduled(fixedRate = 200)
	@Async("taskScheduler2")
	//@Scheduled(cron = "*/1 * * * * *")
	public void show1() {
		System.out.println(new Date()+ "show1 ::"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
