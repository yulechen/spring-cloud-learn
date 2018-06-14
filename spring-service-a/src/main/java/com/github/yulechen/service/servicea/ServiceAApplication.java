package com.github.yulechen.service.servicea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
// 会依据加载的jar 动态选择服务发现的方式（euraka,zk cousul）
@EnableDiscoveryClient
public class ServiceAApplication {

   @Autowired
   private AppConfig config;

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}


	@ResponseBody
	@RequestMapping("/config")
	public AppConfig getCfg(){
		return  this.config;
	}
}
