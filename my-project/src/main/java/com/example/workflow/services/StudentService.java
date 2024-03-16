package com.example.workflow.services;

import java.util.List;


import com.example.workflow.model.StudentModel;
import com.example.workflow.Exception.StudentNotFoundException;

public interface StudentService {
	
	public List<StudentModel> getStudentById(long id) throws StudentNotFoundException;

}
