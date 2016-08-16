package ru.sbt.socialnetwork.linenews;

import ru.sbt.socialnetwork.dom.Post;

import java.util.List;

public interface LinePost {
    List<Post> getPostFromUserId(int userId);
}
