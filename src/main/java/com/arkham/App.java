package com.arkham;

import com.arkham.impl.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {

		for (int i = 0; i < 500; i++) {
			logger.debug("Hello from Log4j 2");
			logger.debug("This is a Debug Message!");
			logger.info("This is an Info Message!");
			logger.error("And here comes the Error Message!", new RuntimeException("RunRunRun"));
		}


		
	}
}