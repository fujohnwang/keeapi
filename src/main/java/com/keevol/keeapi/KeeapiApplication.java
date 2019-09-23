package com.keevol.keeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeeapiApplication {

	public static void main(String[] args) {
		StringUtils.upper("hahaha");
		SpringApplication.run(KeeapiApplication.class, args);
	}

}
