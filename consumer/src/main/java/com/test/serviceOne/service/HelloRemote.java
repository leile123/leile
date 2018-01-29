package com.test.serviceOne.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {
    @RequestMapping(value = "/test/abc/{name}/{num}")
    public String hello(@PathVariable("name") String name, @PathVariable("num") String num);
}
