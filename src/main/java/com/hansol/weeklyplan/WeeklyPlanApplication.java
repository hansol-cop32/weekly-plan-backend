package com.hansol.weeklyplan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.retry.annotation.EnableRetry;

//@EnableRetry
@EnableJpaAuditing
@EnableJpaRepositories
//@EnableBatchProcessing
//@EnableScheduling
@SpringBootApplication
//@EnableRedisHttpSession
//@EnableConfigurationProperties(value = {SlackProperties.class})
@EntityScan(basePackages = {"com.hansol.weeklyplan"})
public class WeeklyPlanApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeeklyPlanApplication.class, args);
	}

}
