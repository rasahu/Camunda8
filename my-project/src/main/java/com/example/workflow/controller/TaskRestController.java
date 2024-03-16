package com.example.workflow.controller;

import java.util.Map;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.services.TaskServices;

@RestController
@RequestMapping("/task")
public class TaskRestController {
	private static final String ID = "/{id}";
	
	@Autowired
	RuntimeService runtimeService;
	
	@Autowired
	TaskServices taskServices;

	@GetMapping("/")
	public ResponseEntity<Map<String,Object>> getAllActiveTask() {
		return new ResponseEntity<Map<String,Object>>(taskServices.getAllActiveTask(), HttpStatus.OK);
	}
	@GetMapping("/claim")
	public ResponseEntity<Map<String,Object>> claimTask() {
		return new ResponseEntity<Map<String,Object>>(taskServices.getAllActiveTask(), HttpStatus.OK);
	}
	
	@GetMapping("/complete/{taskId}")
	public ResponseEntity<String> completeTask(@PathVariable String taskId) {
		return new ResponseEntity<String>(taskServices.completeTask(taskId), HttpStatus.OK);
	}
}
