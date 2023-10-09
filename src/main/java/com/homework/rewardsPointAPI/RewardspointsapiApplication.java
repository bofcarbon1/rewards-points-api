package com.homework.rewardsPointAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RewardspointsapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardspointsapiApplication.class, args);
	}

}
