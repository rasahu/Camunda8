package com.example.workflow.services;

import java.util.Map;

public interface TaskServices {
	
	public Map<String,Object> getAllActiveTask();
	public String completeTask(String taskId) ;

}
