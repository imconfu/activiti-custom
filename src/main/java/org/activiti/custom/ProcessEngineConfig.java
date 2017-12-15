package org.activiti.custom;


import org.activiti.custom.spring.CustomGroupEntityManager;
import org.activiti.custom.spring.CustomUserEntityManager;
import org.activiti.engine.cfg.AbstractProcessEngineConfigurator;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureBefore(org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class)
@ComponentScan(basePackages = {
	"org.activiti.custom",
	"org.activiti.custom.spring"
})
public class ProcessEngineConfig extends AbstractProcessEngineConfigurator{
	
	 public void beforeInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
		 System.out.println("ProcessEngineConfig beforeInit with config: " + processEngineConfiguration.getDatabaseType());
	 }
	 
	 public void configure(ProcessEngineConfigurationImpl processEngineConfiguration)
	  {
		 System.out.println("ProcessEngineConfig configure with config: " + processEngineConfiguration.getDatabaseType());
	    processEngineConfiguration.setUserEntityManager(new CustomUserEntityManager(processEngineConfiguration));
	    processEngineConfiguration.setGroupEntityManager(new CustomGroupEntityManager(processEngineConfiguration));
	  }
}