package com.example.workflow.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StudentModel {
	
	private long id;
	
	private String name;
	
	private int age;

}
