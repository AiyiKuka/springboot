package com.aykk.spb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbApplication.class, args);
	}

}
