package com.test.serviceOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class ServiceOneApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ServiceOneApp.class, args);
    }
}
