package com.piseth.pattern.remoteproxy.server.dto;

import java.util.UUID;

public record UserResponse(
        UUID id,
        String name,
        String email
) {
}
