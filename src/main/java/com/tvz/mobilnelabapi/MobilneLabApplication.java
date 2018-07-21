package com.tvz.mobilnelabapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class})
@ComponentScan(value= { "com.tvz.mobilnelabapi"})
//@EnableEurekaClient
public class MobilneLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilneLabApplication.class, args);
	}
}
