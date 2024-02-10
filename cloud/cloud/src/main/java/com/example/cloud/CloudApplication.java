package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApplication.class, args);
	}

	@Bean
	public RouteLocator customLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("Micro1", r -> r.path("/microService1/**")
						.uri("http://localhost:8081"))
				.route("Micro2", r -> r.path("/microService2/**")
						.uri("http://localhost:8082")).build();
	}

}
