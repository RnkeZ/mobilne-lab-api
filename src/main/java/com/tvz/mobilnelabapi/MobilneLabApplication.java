package com.tvz.mobilnelabapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.tvz.mobilnelabapi.config.FileStorageProperties;

@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(value = { "com.tvz.mobilnelabapi" })
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class MobilneLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilneLabApplication.class, args);
	}
}
