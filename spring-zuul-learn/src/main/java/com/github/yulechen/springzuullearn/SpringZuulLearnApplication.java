package com.github.yulechen.springzuullearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringZuulLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZuulLearnApplication.class, args);
	}
}
