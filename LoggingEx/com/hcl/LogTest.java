package com.hcl;
import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;
public class LogTest {
	public static void main(String[] args) {
		final Logger logger = Logger.getLogger(LogTest.class);
		DOMConfigurator.configure("LogConfig.xml");
		
		/*
		// Can do FileAppender in this way also 
		SimpleLayout layout = new SimpleLayout();
		FileAppender appender = null;
		try{
			appender = new FileAppender(layout, "Output.txt");
		}catch (Exception e){}
		logger.addAppender(appender);
		*/
		
		System.out.println("Hey just testing");
		logger.trace("Here is some TRACE");
		logger.debug("Here is some DEBUG");
		logger.info("Here is some INFO");
		logger.warn("Here is some WARN");
		logger.error("Here is some ERROR");
		logger.fatal("Here is some FATAL");
	}
}