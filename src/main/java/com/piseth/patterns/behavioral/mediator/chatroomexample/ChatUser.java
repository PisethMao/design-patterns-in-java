package com.piseth.patterns.behavioral.mediator.chatroomexample;

public class ChatUser extends User {
    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        IO.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        IO.println(name + " receives: " + message);
    }
}
