/**
 * 
 */
package com.mycom.EmployeeManager.tasks;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author 1028654
 *
 */
@Configuration
public class TaskConfig {
	

	@Bean("myexecutor")
	public TaskExecutor executor() {
		ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();
		executor.setMaxPoolSize(10);
		executor.setCorePoolSize(1);
		executor.setThreadNamePrefix("default_task_executor_thread");
		executor.initialize();
		
		
		return executor;
	}
}
