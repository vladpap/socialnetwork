package ru.sbt.socialnetwork.dom;

import org.junit.Test;

import javax.print.DocFlavor;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class PostTest {

    @Test
    public void postCreateTest() {
        Date today = new Date();
        Post post = new Post(new User(13, "Sidorov", "Dima"),
                today, "As text for post from wall",
                new ArrayList<User>(),
                null);
        assertEquals("Dima Sidorov", post.getAutor().getFullName());
    }

}