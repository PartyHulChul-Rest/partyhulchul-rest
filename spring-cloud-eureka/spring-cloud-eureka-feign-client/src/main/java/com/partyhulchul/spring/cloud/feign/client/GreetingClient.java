package com.partyhulchul.spring.cloud.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.partyhulchul.spring.cloud.eureka.client.GreetingController;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient extends GreetingController {
}
