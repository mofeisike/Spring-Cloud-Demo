package com.mofeisike.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	// @LoadBalanced 这个注解可以提让RestTemplate对象供负载均衡
	// 声明⼀个基于 Ribbon 的负载均衡。
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
