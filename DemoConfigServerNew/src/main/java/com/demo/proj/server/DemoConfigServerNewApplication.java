package com.demo.proj.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoConfigServerNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigServerNewApplication.class, args);
	}

}
