package ru.sbt.socialnetwork.dom;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class User {
    private final int userId;
    private final String lastName;
    private final String firstName;
    private final Image photo;
    private final List<User> frends;
    private final List<Award> awards;
    private final List<Present> presents;

    /**
     * Create short format user
     * Set photo as null
     * Set frends, awards and present is empty.
     *
     * @param userId
     * @param lastName
     * @param firstName
     */
    public User(int userId, String lastName, String firstName){
        this(userId, lastName, firstName, null, new ArrayList<User>(), new ArrayList<Award>(), new ArrayList<Present>());
    }

    public User(int userId, String lastName, String firstName, Image photo, List<User> frends, List<Award> awards, List<Present> presents) {
        this.userId = userId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.photo = photo;
        this.frends = frends;
        this.awards = awards;
        this.presents = presents;
    }

    public int getUserId() {
        return userId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Image getPhoto() {
        return photo;
    }

    public List<User> getFrends() {
        return frends;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public List<Present> getPresents() {
        return presents;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}