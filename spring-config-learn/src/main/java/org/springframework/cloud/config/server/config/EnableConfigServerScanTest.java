package org.springframework.cloud.config.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnableConfigServerScanTest {

    class A{};
    @Bean
    public A testRun(){
        System.out.println("EnableConfigServer  go into effect。。。");
        return  new A();
    }
}
