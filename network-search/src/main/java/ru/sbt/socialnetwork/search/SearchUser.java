package ru.sbt.socialnetwork.search;

import ru.sbt.socialnetwork.client.Client;
import ru.sbt.socialnetwork.dom.User;

import java.util.List;

public class SearchUser implements Search {

    public SearchUser() {
    }

    @Override
    public List<User> searchUsersByLastName(String lastName) {
        return Client.searchUsers(null, lastName);
    }

    @Override
    public List<User> searchUsersByFirstName(String firstName) {
        return Client.searchUsers(firstName, null);
    }

    @Override
    public List<User> searchUsersByFullName(String firstName, String lastName) {
        return Client.searchUsers(firstName, lastName);
    }
}
