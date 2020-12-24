package com.training;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingTest {

	public static final Logger log = LogManager.getLogger(LoggingTest.class);
	
	public static void main(String[] args) {
		
		String type = "parameterised logging";
		
		log.info("Type of logging - {}",type);
		
		LoggingTypes loggingTypes = new LoggingTypes();
		loggingTypes.testLogging();
	}

}
