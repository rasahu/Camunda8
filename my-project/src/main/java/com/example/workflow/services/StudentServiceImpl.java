package com.example.workflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.workflow.Exception.StudentNotFoundException;
import com.example.workflow.model.StudentModel;

@Service
public class StudentServiceImpl implements StudentService{

	@Override
	public List<StudentModel> getStudentById(long id) throws StudentNotFoundException{
		List<StudentModel> modelList=new ArrayList<>();
		if(id==1) {
			throw new StudentNotFoundException(id);
		}
		else {
			StudentModel model =StudentModel.builder().id(1).age(42).
					name("Rakesh").build();
			modelList.add(model);
			StudentModel model2 =StudentModel.builder().id(2).age(12).
					name("Satvik").build();
			modelList.add(model2);
			return modelList;
		}
		
	}
	

}
