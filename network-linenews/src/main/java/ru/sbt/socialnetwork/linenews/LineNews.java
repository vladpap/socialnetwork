package ru.sbt.socialnetwork.linenews;

import ru.sbt.socialnetwork.client.Client;
import ru.sbt.socialnetwork.dom.Post;

import java.util.List;

public class LineNews implements LinePost{
    private static final int COUNTPOSTS = 10;

    public LineNews() {
    }

    @Override
    public List<Post> getPostFromUserId(int userId) {
        int startPosition = 0;
        return Client.getPosts(userId, startPosition, COUNTPOSTS);
    }
}