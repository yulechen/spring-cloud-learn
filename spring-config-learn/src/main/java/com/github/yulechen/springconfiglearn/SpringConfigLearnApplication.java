package com.github.yulechen.springconfiglearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 *
 * # Bootstrap components
 org.springframework.cloud.bootstrap.BootstrapConfiguration=\
 org.springframework.cloud.config.server.bootstrap.ConfigServerBootstrapConfiguration,\
 org.springframework.cloud.config.server.config.EncryptionAutoConfiguration

 # Application listeners
 org.springframework.context.ApplicationListener=\
 org.springframework.cloud.config.server.bootstrap.ConfigServerBootstrapApplicationListener

 # Autoconfiguration
 org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
 org.springframework.cloud.config.server.config.ConfigServerAutoConfiguration,\
 org.springframework.cloud.config.server.config.EncryptionAutoConfiguration

 *
 *
 */
@SpringBootApplication
//EnableConfigServer 生成 maker 类，ConfigServerAutoConfiguration 依据生成的maker 来配置
@EnableConfigServer
public class SpringConfigLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigLearnApplication.class, args);
	}
}
