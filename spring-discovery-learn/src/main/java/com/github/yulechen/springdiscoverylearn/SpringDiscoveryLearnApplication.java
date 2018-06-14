package com.github.yulechen.springdiscoverylearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringDiscoveryLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDiscoveryLearnApplication.class, args);
	}
}
