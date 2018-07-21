package com.tvz.mobilnelabapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tvz.mobilnelabapi.utility.MobilneLabUtility;


@Configuration
public class UtilityBeanConfig {
	
	@Bean
	public MobilneLabUtility sppiTestUtility() {
		return new MobilneLabUtility();
	}

}
