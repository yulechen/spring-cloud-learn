package com.github.yulechen.springdiscoverylearn;

import com.github.yulechen.springdiscoverylearn.feign.ServiceAFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired(required=false)
    private ServiceAFeign serviceAFeign;

    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String callServerAIdMethod(){
        return serviceAFeign.callServerAIdMethod();
    }
}
