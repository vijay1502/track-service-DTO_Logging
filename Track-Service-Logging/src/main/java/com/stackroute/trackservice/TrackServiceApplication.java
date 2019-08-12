package com.stackroute.trackservice;

import com.stackroute.trackservice.controller.TrackController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSOutput;
import springfox.documentation.swagger2.annotations.EnableSwagger2;




@EnableSwagger2

@SpringBootApplication
public class TrackServiceApplication {
private static Logger logger= (Logger) LoggerFactory.getLogger(TrackServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TrackServiceApplication.class, args);
		logger.debug("This is Debug message");
		logger.error("This is error");
		logger.info("This is for info");
		logger.trace("Trace Message");
		logger.warn("Warning in your code");

	}
}
