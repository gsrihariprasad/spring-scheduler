package com.sriharilabs.schedulers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
public class DemoConf {
	@Bean
	public  ThreadPoolTaskScheduler  taskScheduler2(){
	    ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
	    taskScheduler.setPoolSize(2);
	    //taskScheduler.setWaitForTasksToCompleteOnShutdown(false);
	    //taskScheduler.setAwaitTerminationSeconds(1);
	    return  taskScheduler;
	}	
	@Bean
	public  ThreadPoolTaskScheduler  taskScheduler1(){
	    ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
	    taskScheduler.setPoolSize(3);
	    //taskScheduler.setWaitForTasksToCompleteOnShutdown(false);
	    //taskScheduler.setAwaitTerminationSeconds(1);
	    return  taskScheduler;
	}	
}
