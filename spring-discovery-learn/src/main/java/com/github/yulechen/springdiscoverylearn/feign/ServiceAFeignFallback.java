package com.github.yulechen.springdiscoverylearn.feign;


public class ServiceAFeignFallback implements ServiceAFeign {

    @Override
    public String callServerAIdMethod() {
        System.out.println("ervera  callServerAIdMethod is error");
        return "servera  callServerAIdMethod is error";
    }
}
