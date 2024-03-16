package com.example.workflow.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workflow.model.TaskModel;

@Service
public class TaskServicesImpl implements TaskServices {

	@Autowired
	TaskService taskService;

	@Override
	public Map<String, Object> getAllActiveTask() {
		Map<String, Object> responseMap = new HashMap<>();
		List<Task> taskList = taskService.createTaskQuery().list();
		Map<String, TaskModel> taskMap = new HashMap<>();
		List<Map<String, TaskModel>> as = new ArrayList<>();
		for (Task task : taskList) {
			TaskModel taskModel = TaskModel.builder().taskId(task.getId()).taskName(task.getName())
					.taskDescription(task.getDescription()).build();
			taskMap.put("task", taskModel);
			System.out.println("task Id Is ::" + task.getId());
			as.add(taskMap);
		}
		responseMap.put("TaskList", as);
		return responseMap;
	}

	@Override
	public String completeTask(String taskId) {
        taskService.complete(taskId);
		return "Task is completed Sucessfully.";
	}

}
