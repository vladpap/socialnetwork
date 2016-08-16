package ru.sbt.socialnetwork.dom;

import java.util.Date;

public class Message {
    private final int messageId;
    private final User user;
    private final User fromUser;
    private final Date creationDate;
    private final String message;

    public Message(int messageId, User user, Date creationDate, String message, User fromUser) {
        this.messageId = messageId;
        this.user = user;
        this.creationDate = creationDate;
        this.message = message;
        this.fromUser = ((fromUser == null) ? user : fromUser); // From chats
    }

    public int getMessageId() {
        return messageId;
    }

    public User getUser() {
        return user;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getMessage() {
        return message;
    }

    public User getFromUser() {
        return fromUser;
    }
}
