package com.example.workflow.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.model.GeneralResponse;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/getGeneralResponse")
	public ResponseEntity<GeneralResponse> listGeneralResponse(){
		return new ResponseEntity<GeneralResponse>(new GeneralResponse(456,"sucess"), HttpStatus.OK);
	}

	
	
}
