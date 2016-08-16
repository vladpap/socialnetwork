package ru.sbt.socialnetwork.linenews;

import org.junit.Test;
import ru.sbt.socialnetwork.dom.Post;

import java.util.List;

import static org.junit.Assert.*;

public class LineNewsTest {


    @Test
    public void lineNewsCreateTest() {
        LinePost line = new LineNews();
        List<Post> postList = line.getPostFromUserId(44);
        assertEquals(10, postList.size());
    }



}