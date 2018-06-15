package com.github.yulechen.springdiscoverylearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer",method = RequestMethod.GET)
    public String callServerAIdMethod(){
       // URL 为注册中心的Applicationname
       return restTemplate.getForEntity("http://SERVICE-A/id", String.class).getBody();
    }

}
