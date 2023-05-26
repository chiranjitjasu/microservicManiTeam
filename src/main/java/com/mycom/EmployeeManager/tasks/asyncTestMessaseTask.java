/**
 * 
 */
package com.mycom.EmployeeManager.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Component;

/**
 * @author 1028654
 *
 */
@Component
public class asyncTestMessaseTask {
	
	@Autowired
	@Qualifier("myexecutor")
    private TaskExecutor taskExecutor;
	
	
	 public void executeAsynchronously() {
		 
		 taskExecutor.execute(new TaskThread());
		 
	 }

}
