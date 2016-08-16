package ru.sbt.socialnetwork.dom;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class MessageTest {

    @Test
    public void messageCreateTest() {
        Message message = new Message(101,
                new User(15, "Petrov", "Oleg"),
                new Date(),
                "Hi",
                null);
        assertEquals("Oleg Petrov", message.getUser().getFullName());
        assertEquals(message.getUser().getFullName(), message.getFromUser().getFullName());
    }

}