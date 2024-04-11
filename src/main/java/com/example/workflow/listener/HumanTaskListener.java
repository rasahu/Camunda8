package com.example.workflow.listener;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

public class HumanTaskListener implements TaskListener {

	@Override
	public void notify(DelegateTask delegateTask) {
		
		System.out.println("deligate task event Name is"+delegateTask.getEventName());

	}

}
