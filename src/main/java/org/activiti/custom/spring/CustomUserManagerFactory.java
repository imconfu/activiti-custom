package org.activiti.custom.spring;

import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.interceptor.SessionFactory;

public class CustomUserManagerFactory implements SessionFactory {
	protected ProcessEngineConfigurationImpl processEngineConfiguration;

	public Session openSession(CommandContext arg0) {
		System.out.println("CustomUserManagerFactory openSession with arg: " + arg0);
		CustomUserEntityManager userManager = new CustomUserEntityManager(processEngineConfiguration);
		return (Session) userManager;
	}

	public Class<?> getSessionType() {
		System.out.println("CustomGroupManagerFactory getSessionType: ");
		return CustomUserEntityManager.class;
	}

	public ProcessEngineConfigurationImpl getProcessEngineConfiguration() {
		return processEngineConfiguration;
	}

	public void setProcessEngineConfiguration(ProcessEngineConfigurationImpl processEngineConfiguration) {
		this.processEngineConfiguration = processEngineConfiguration;
	}

}
