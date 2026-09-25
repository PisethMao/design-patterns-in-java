package com.piseth.pattern.remoteproxy.client.controller;

import com.piseth.pattern.remoteproxy.client.dto.UserResponse;
import com.piseth.pattern.remoteproxy.client.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/demo/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public UserResponse findById(
            @PathVariable UUID id
    ) {
        return userService.findById(id);
    }

    @GetMapping
    public List<UserResponse> findAll() {
        return userService.findAll();
    }
}