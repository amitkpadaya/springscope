package com.my.scope.scopetesting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScopetestingApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(ADoa.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(ScopetestingApplication.class, args);
		/*ADoa aDoa = context.getBean(ADoa.class);
		BDoa bDoa = context.getBean(BDoa.class);*/

		LOGGER.info("{}", context.getBean(ADoa.class) );
		LOGGER.info("{}", context.getBean(ADoa.class).getJdbcTemplate() );
		LOGGER.info("{}", context.getBean(ADoa.class) );
		LOGGER.info("{}", context.getBean(ADoa.class).getJdbcTemplate() );
	}

}
