package com.aykk.spb.service;

import org.apache.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class ApplicationStartRunner implements ApplicationRunner {

	private static final Logger LOGGER = Logger.getLogger(ApplicationStartRunner.class);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOGGER.info("Start loading your items.");
	}

}
