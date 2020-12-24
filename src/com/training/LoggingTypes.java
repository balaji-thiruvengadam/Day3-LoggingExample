package com.training;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingTypes {
	
	public static final Logger log = LogManager.getLogger(LoggingTypes.class);
			
	public void testLogging () {
		log.fatal("org.apache.logging.log4j type - fatal");
		log.error("org.apache.logging.log4j type - error");
		log.warn("org.apache.logging.log4j type - warn"); 
		log.info("org.apache.logging.log4j type - info");
		
		/*The guard statement (checking isDebugEnabled() ) is there to prevent 
		 * potentially expensive computation of the log message 
		 * when it involves invocation of the toString() methods of various objects and concatenating the results
		 */
		
		if (log.isDebugEnabled()){
			log.debug("org.apache.logging.log4j type - debug");
		}
	}
}
