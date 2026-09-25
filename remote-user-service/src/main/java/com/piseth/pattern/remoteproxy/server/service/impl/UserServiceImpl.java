package com.piseth.pattern.remoteproxy.server.service.impl;

import com.piseth.pattern.remoteproxy.server.dto.UserResponse;
import com.piseth.pattern.remoteproxy.server.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    private final Map<UUID, UserResponse> users = Map.of(
            UUID.fromString("550e8400-e29b-41d4-a716-446655440001"),
            new UserResponse(
                    UUID.fromString("550e8400-e29b-41d4-a716-446655440001"),
                    "Piseth",
                    "piseth@example.com"
            ),
            UUID.fromString("550e8400-e29b-41d4-a716-446655440002"),
            new UserResponse(
                    UUID.fromString("550e8400-e29b-41d4-a716-446655440002"),
                    "Dara",
                    "dara@example.com"
            ),
            UUID.fromString("550e8400-e29b-41d4-a716-446655440003"),
            new UserResponse(
                    UUID.fromString("550e8400-e29b-41d4-a716-446655440003"),
                    "Sokha",
                    "sokha@example.com"
            )
    );
    @Override
    public UserResponse findById(UUID id) {
        IO.println(
                "[REMOTE SERVER] Finding user: " + id
        );
        UserResponse user = users.get(id);
        if (user == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "User not found: " + id
            );
        }
        return user;
    }

    @Override
    public List<UserResponse> findAll() {
        IO.println(
                "[REMOTE SERVER] Finding all users"
        );
        return users.values()
                .stream()
                .toList();
    }
}