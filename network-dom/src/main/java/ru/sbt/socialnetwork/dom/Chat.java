package ru.sbt.socialnetwork.dom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chat {
    private final int chatId;
    private final String title;
    private final List<User> usersIdChat;
    private final List<Message> messageList;

    public Chat(int chatId, User user, String title) {
        this.chatId = chatId;
        this.title = title;
        this.usersIdChat = new ArrayList<>();
        this.usersIdChat.add(user);
        this.messageList = new ArrayList<>();
    }

    public void addUserFromChat(User user) {
        if (isMemberChat(user.getUserId())) {
            throw new IllegalArgumentException("User " + user.getFullName() + " has a chat member.");
        } else {
            usersIdChat.add(user);
        }
    }

    public String getTitle() {
        return title;
    }

    public List<User> getUsersIdChat() {
        return usersIdChat;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void newMessageFromChat(Message message) {

        if (isMemberChat(message.getUser().getUserId())) {
            messageList.add(message);
        } else {
            throw new IllegalArgumentException("User " + message.getUser().getFullName() + " not included in the chat list.");
        }
    }

    private boolean isMemberChat(int userId) {

        boolean memberChat = false;
        for (User user : usersIdChat) {
            if (user.getUserId() == userId) {
                memberChat = true;
                break;
            }
        }
        return memberChat;
    }
}
