package com.tvz.mobilnelabapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(value = { "com.tvz.mobilnelabapi" })
public class MobilneLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilneLabApplication.class, args);
	}
}
