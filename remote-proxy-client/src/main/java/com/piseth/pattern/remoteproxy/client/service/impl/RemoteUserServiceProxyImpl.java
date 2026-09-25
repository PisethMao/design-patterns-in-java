package com.piseth.pattern.remoteproxy.client.service.impl;

import com.piseth.pattern.remoteproxy.client.dto.UserResponse;
import com.piseth.pattern.remoteproxy.client.service.UserService;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.UUID;

@Service
public class RemoteUserServiceProxyImpl implements UserService {
    private final RestClient restClient;

    public RemoteUserServiceProxyImpl(RestClient restClient) {
        this.restClient = restClient;
    }

    @Override
    public UserResponse findById(UUID id) {
        IO.println(
                "[REMOTE PROXY] Calling remote server for user: "
                        + id
        );
        return restClient
                .get()
                .uri("/api/v1/users/{id}", id)
                .retrieve()
                .body(UserResponse.class);
    }

    @Override
    public List<UserResponse> findAll() {
        IO.println(
                "[REMOTE PROXY] Calling remote server for all users"
        );
        return restClient
                .get()
                .uri("/api/v1/users")
                .retrieve()
                .body(
                        new ParameterizedTypeReference<>() {
                        }
                );
    }
}