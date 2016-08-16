package ru.sbt.socialnetwork.client;


import ru.sbt.socialnetwork.dom.Post;
import ru.sbt.socialnetwork.server.Server;
import ru.sbt.socialnetwork.dom.User;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static ArrayList<Image> getImagesFromUserId(int userId) {
        return new ArrayList<Image>();
    }

    public static User getUserProfile(int userId) {
        User result = Server.getUserFromId(12);
        return result;
    }

    public static List<Post> getPosts(int userId, int startPosition, int countposts) {

        return Server.getPosts(userId).subList(startPosition, startPosition + countposts);
    }


    public static List<User> searchUsers(String firstName, String lastName) {
        List<User> result = Server.searchUsers((firstName == null) ? "*" : firstName, (lastName == null) ? "*" : lastName);
        return result;
    }
}
