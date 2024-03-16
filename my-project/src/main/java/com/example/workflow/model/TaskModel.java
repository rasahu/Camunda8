package com.example.workflow.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TaskModel {
	private String taskId;
	private String taskName;
	private String taskDescription;
	

}
