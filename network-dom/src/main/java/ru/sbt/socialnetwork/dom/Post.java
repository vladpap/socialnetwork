package ru.sbt.socialnetwork.dom;

import java.net.URL;
import java.util.Date;
import java.util.List;

public class Post {
    private final User autor;
    private final Date creationDate;
    private final List<User> likes;
    private final URL share;
    private final String text;

    public Post(User autor, Date creationDate, String text, List<User> likes, URL share) {
        this.autor = autor;
        this.creationDate = creationDate;
        this.text = text;
        this.likes = likes;
        this.share = share;
    }

    public User getAutor() {
        return autor;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public List<User> getLikes() {
        return likes;
    }

    public URL getShare() {
        return share;
    }
}
