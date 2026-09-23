package com.piseth.patterns.creational.builder.lombokbuilder.userexample;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class User {
    private final String username;
    private final String email;
    private final String phoneNumber;
    private final String address;
    private final Integer age;
    private final Boolean isAccountActive;
}
