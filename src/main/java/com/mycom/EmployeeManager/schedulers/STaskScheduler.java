/**
 * 
 */
package com.mycom.EmployeeManager.schedulers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.mycom.EmployeeManager.tasks.asyncTestMessaseTask;

/**
 * @author 1028654
 *
 */
/*
+-------------------- second (0 - 59)
|  +----------------- minute (0 - 59)
|  |  +-------------- hour (0 - 23)
|  |  |  +----------- day of month (1 - 31)
|  |  |  |  +-------- month (1 - 12)
|  |  |  |  |  +----- day of week (0 - 6) (Sunday=0 or 7)
|  |  |  |  |  |  +-- year [optional]
|  |  |  |  |  |  |
*  *  *  *  *  *  * command to be executed 
**/
@Component
public class STaskScheduler {
	
	@Autowired
	asyncTestMessaseTask asyncTestMessaseTask;
//	Applicationcon asynchronousServiceMessage;

	@Scheduled(cron = "*/5 * * * * *")
	public void performTask() {
		asyncTestMessaseTask.executeAsynchronously();
		System.out.println("Regular task performed at " + new Date());

	}
}
