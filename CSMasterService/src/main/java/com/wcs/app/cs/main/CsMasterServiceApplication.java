package com.wcs.app.cs.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com")
@EnableEurekaClient
@EnableJpaRepositories(basePackages="com.wcs.app.cs.main.repository")
@EntityScan(basePackages="com.wcs.app.cs.main.model")
public class CsMasterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsMasterServiceApplication.class, args);
	}

}
