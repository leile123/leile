package com.test.serviceOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CoustermApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(CoustermApp.class, args);
    }
}
