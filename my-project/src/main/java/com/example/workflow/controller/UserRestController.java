package com.example.workflow.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.model.StudentModel;
import com.example.workflow.services.StudentService;


@RestController
@RequestMapping("/students")
public class UserRestController {
	
	private static final String ID = "/{id}";
     @Autowired
	StudentService studentService;
	@GetMapping("/hello")
	public String sayHello() {
		return "RAKESH FROM CTS huuuuuu";
	}
	
	@PostMapping(ID)
	public ResponseEntity<Map<String,Object>> getAllStudents(@PathVariable long id){
		List<StudentModel> obj=studentService.getStudentById(id);
		Map<String,Object> ahs =new HashMap<>();
		ahs.put("All Emplyee",obj );
		return new ResponseEntity<Map<String,Object>>(ahs,HttpStatus.OK);
	}


}
