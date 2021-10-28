package com.microservices.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p.path("/api/commandes/**")
						.uri("lb://commandes-service"))
				.route(p -> p.path("/api/medicaments/**")
						.uri("lb://medicaments-service"))
				.route(p -> p.path("/api/admins/**")
						.uri("lb://admins-service"))
				.route(p -> p.path("/api/medicals/**")
						.uri("lb://medicals-service"))
				.route(p -> p.path("/api/patients/**")
						.uri("lb://patients-service"))
				.route(p -> p.path("/api/providers/**")
						.uri("lb://providers-service"))
				.route(p -> p.path("/api/reclamations/**")
						.uri("lb://reclamations-service"))
				.route(p -> p.path("/api/rendez-vous/**")
						.uri("lb://rendez-vous-service"))
				.route(p -> p.path("/api/staffs/**")
						.uri("lb://staffs-service"))
				.build();
	}

}