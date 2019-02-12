package com.supplier.commodity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.supplier.commons.itf")
public class CommodityApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommodityApplication.class, args);
	}
}
