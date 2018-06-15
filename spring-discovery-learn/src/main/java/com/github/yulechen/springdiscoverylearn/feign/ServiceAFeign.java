package com.github.yulechen.springdiscoverylearn.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(value = "SERVICE-A",fallback = ServiceAFeignFallback.class)
@Service
public interface ServiceAFeign {

    @PostMapping("/id")
    public String callServerAIdMethod();

}

