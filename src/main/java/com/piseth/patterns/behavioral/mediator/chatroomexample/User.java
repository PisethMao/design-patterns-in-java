package com.piseth.patterns.behavioral.mediator.chatroomexample;

import lombok.Getter;

public abstract class User {
    protected final ChatMediator mediator;
    @Getter
    protected final String name;

    protected User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}