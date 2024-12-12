package com.mindtree.camunda.workflow.listeners;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HrApprovalListener implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println("calling HrApprovalListener  ");

    }
}
