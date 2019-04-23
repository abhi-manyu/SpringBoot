package org.applicationContext_Change.controllers;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@Component
public class ContextPath implements EmbeddedServletContainerCustomizer
{

	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setContextPath("/context_change");
		
	}

}
