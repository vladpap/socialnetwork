package ru.sbt.socialnetwork.dom;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void userTestCreate() {
        User user = new User(12, "Sidorov", "Ivan");
        assertEquals(12, user.getUserId());
        assertEquals("Ivan Sidorov", user.getFullName());
    }

}