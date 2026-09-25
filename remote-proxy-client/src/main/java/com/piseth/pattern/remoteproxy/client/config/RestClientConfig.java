package com.piseth.pattern.remoteproxy.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {
    @Bean
    public RestClient userServiceRestClient(
            @Value("${remote.user-service.base-url}") String baseUrl,
            @Value("${remote.user-service.username}") String username,
            @Value("${remote.user-service.password}") String password
    ) {
        return RestClient.builder()
                .baseUrl(baseUrl)
                .defaultHeaders(headers ->
                        headers.setBasicAuth(username, password)
                )
                .build();
    }
}