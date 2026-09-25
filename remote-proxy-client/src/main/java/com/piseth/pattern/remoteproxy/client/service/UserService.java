package com.piseth.pattern.remoteproxy.client.service;

import com.piseth.pattern.remoteproxy.client.dto.UserResponse;

import java.util.List;
import java.util.UUID;

public interface UserService {
    UserResponse findById(UUID id);

    List<UserResponse> findAll();
}