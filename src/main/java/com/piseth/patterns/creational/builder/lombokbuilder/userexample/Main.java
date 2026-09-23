package com.piseth.patterns.creational.builder.lombokbuilder.userexample;

public class Main {
    void main() {
        User user = User.builder()
                .username("pisethmao")
                .email("pisethmao2002@gmail.com")
                .phoneNumber("095256602")
                .address("Phnom Penh")
                .age(21)
                .isAccountActive(true)
                .build();
        User user2 = User.builder()
                .username("pisethmao")
                .email("pisethmao2002@gmail.com")
                .phoneNumber("095256602")
                .age(21)
                .isAccountActive(true)
                .build();
        User user3 = User.builder()
                .username("pisethmao")
                .email("pisethmao2002@gmail.com")
                .build();
        IO.println(user);
        IO.println(user2);
        IO.println(user3);
    }
}
