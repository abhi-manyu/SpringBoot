package org.port_change.controllers;


import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@Component
public class ChangeController implements EmbeddedServletContainerCustomizer
{

	public void customize(ConfigurableEmbeddedServletContainer container) {
         container.setPort(5001);
		
	}

}
