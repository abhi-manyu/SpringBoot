package org.Boot_Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootLog 
{
	private static final Logger logger=LoggerFactory.getLogger(BootLog.class);
    public static void main( String[] args )
    {
       SpringApplication.run(BootLog.class, args);
       logger.info("this is a info message");
       logger.error("this is a error message");
       logger.warn("this is a warning message");
       logger.debug("this is a debug message");
    }
}
