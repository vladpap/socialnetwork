package ru.sbt.socialnetwork.search;

import ru.sbt.socialnetwork.dom.User;

import java.util.List;

public interface Search {
    List<User> searchUsersByLastName(String lastName);
    List<User> searchUsersByFirstName(String firstName);
    List<User> searchUsersByFullName(String firstName, String lastName);
}
