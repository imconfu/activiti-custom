package org.activiti.custom.spring;

import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.interceptor.SessionFactory;

public class CustomGroupManagerFactory implements SessionFactory {
	protected ProcessEngineConfigurationImpl processEngineConfiguration;
  
	public Session openSession(CommandContext arg0) {
		System.out.println("CustomGroupManagerFactory openSession with arg: " + arg0);
		CustomGroupEntityManager groupManager = new CustomGroupEntityManager(processEngineConfiguration);
		return (Session) groupManager;
	}

	public Class<?> getSessionType() {
		System.out.println("CustomGroupManagerFactory getSessionType: ");
		return CustomGroupEntityManager.class;
	}

	public ProcessEngineConfigurationImpl getProcessEngineConfiguration() {
		return processEngineConfiguration;
	}

	public void setProcessEngineConfiguration(ProcessEngineConfigurationImpl processEngineConfiguration) {
		this.processEngineConfiguration = processEngineConfiguration;
	}

}
