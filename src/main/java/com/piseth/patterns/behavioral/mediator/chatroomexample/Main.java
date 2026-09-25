package com.piseth.patterns.behavioral.mediator.chatroomexample;

public class Main {
    public static void main(){
        ChatMediator chatRoom = new ChatRoom();
        User piseth = new ChatUser(chatRoom, "Piseth");
        User dara = new ChatUser(chatRoom, "Dara");
        User sokha = new ChatUser(chatRoom, "Sokha");
        chatRoom.addUser(piseth);
        chatRoom.addUser(dara);
        chatRoom.addUser(sokha);
        piseth.send("Hello everyone!");
    }
}
