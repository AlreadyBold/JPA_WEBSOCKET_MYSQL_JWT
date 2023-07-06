package com.JpaChat.jpachatstudy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
class JpachatstudyApplicationTests {

	@Test
	@GetMapping(value = "/log")
	public void log() throws Exception {

		// FATAL, ERROR, WARN, INFO, DEBUG, TRACE
		log.fatal("FATAL");
		log.error("ERROR");
		log.warn("WARN");
		log.info("INFO");
		log.debug("DEBUG");
		log.trace("TRACE");
	}

}
