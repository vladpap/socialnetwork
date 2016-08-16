package ru.sbt.socialnetwork.dom;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ChatTest {

    @Test
    public void chatCreateAndAddUserTest() {

        User user1 = new User(12, "Ivanov", "Oleg");
        User user2 = new User(14, "Petrov", "Ivan");
        Chat chat = new Chat(20, user1, "Sbt");
        assertEquals(1, chat.getUsersIdChat().size());

        chat.addUserFromChat(user2);
        assertEquals(2, chat.getUsersIdChat().size());

        Message message = new Message(1, user1, new Date(), "Hi", null);
        chat.newMessageFromChat(message);
        assertEquals(1, chat.getMessageList().size());
        assertEquals("Oleg Ivanov", chat.getMessageList().get(0).getUser().getFullName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void chatAddUserException() {

        User user1 = new User(12, "Ivanov", "Oleg");
        User user4 = new User(9, "Krylov", "Petr");
        Chat chat = new Chat(20, user1, "Sbt");
        chat.addUserFromChat(user1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void chatAddUserExceptionNotIncludedChat() {

        User user1 = new User(12, "Ivanov", "Oleg");
        User user4 = new User(9, "Krylov", "Petr");
        Chat chat = new Chat(20, user1, "Sbt");
        Message message = new Message(1, user4, new Date(), "Hi", null);
        chat.newMessageFromChat(message);
    }

}