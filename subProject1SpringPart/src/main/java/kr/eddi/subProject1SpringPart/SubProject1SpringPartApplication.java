package kr.eddi.subProject1SpringPart;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@Slf4j
public class SubProject1SpringPartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubProject1SpringPartApplication.class, args);
		log.info("Hello, Spring");
	}

}
