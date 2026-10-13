package com.tourism;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunctions;

@Configuration
public class GatewayConfig {

    @Bean
    public RouterFunction<ServerResponse> touristRouter() {

        return RouterFunctions.route()
                .GET("/tourists", request ->
                        ServerResponse.ok()
                                .body("Smart Tourism Portal"))
                .build();
    }
}