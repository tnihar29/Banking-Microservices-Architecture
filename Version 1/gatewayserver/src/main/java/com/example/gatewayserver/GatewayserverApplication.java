package com.example.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

	@Bean
	public RouteLocator bankRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/niharbank/accounts/**")
						.filters(f -> f
								.rewritePath("/niharbank/accounts/(?<segment>.*)", "/${segment}")
								.addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
						.uri("lb://ACCOUNTS"))
				.route(p -> p
						.path("/niharbank/cards/**")
						.filters(
								f -> f.rewritePath("/niharbank/cards/(?<segment>.*)", "/${segment}"))
						.uri("lb://CARDS"))
				.route(p -> p
						.path("/niharbank/loans/**")
						.filters(
								f -> f.rewritePath("/niharbank/loans/(?<segment>.*)", "/${segment}"))
						.uri("lb://LOANS"))
				.build();
	}

}
