package com.example.workflow.controller;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.Exception.ProcessNotStartedException;

@RestController
@RequestMapping("/process")
public class ProcessRestController {

	private static final String ID = "/{id}";

	@Autowired
	private RuntimeService runtimeService;

	@GetMapping("/start/{processKey}")
	public ResponseEntity<Object> startProcess(@PathVariable String processKey) {
		ProcessInstance processInstance;
		try {
			processInstance = runtimeService.startProcessInstanceByKey(processKey);
		} catch (Exception e) {
			throw new ProcessNotStartedException(processKey);
		}
		return new ResponseEntity<Object>(processInstance.getProcessInstanceId(), HttpStatus.OK);
	}

}
