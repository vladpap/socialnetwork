package ru.sbt.socialnetwork.search;

import org.junit.Test;
import ru.sbt.socialnetwork.dom.User;

import java.util.List;

import static org.junit.Assert.*;

public class SearchUserTest {

    @Test
    public void searchUsersbyFirstName() {
        SearchUser searchUser = new SearchUser();
        List<User> result = searchUser.searchUsersByFirstName("Oleg");
        for (User user : result) {
            assertEquals("Oleg", user.getFirstName());
        }
    }

    @Test
    public void searchUsersbyLastName() {
        SearchUser searchUser = new SearchUser();
        List<User> result = searchUser.searchUsersByLastName("Sidorov");
        for (User user : result) {
            assertEquals("Sidorov", user.getLastName());
        }
    }

    @Test
    public void searchUsersbyFullName() {
        SearchUser searchUser = new SearchUser();
        List<User> result = searchUser.searchUsersByFullName("Dima", "Sidorov");
        for (User user : result) {
            assertEquals("Dima Sidorov", user.getFullName());
        }
    }

}