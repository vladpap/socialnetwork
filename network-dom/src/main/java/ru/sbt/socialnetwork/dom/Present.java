package ru.sbt.socialnetwork.dom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Present {
    private final int presentId;
    private final String title;
    private final User fromUserId;
    private final Date whatDay;

    public Present(int presentId, String title, User fromUserId, Date whatDay) {
        this.presentId = presentId;
        this.title = title;
        this.fromUserId = fromUserId;
        this.whatDay = whatDay;
    }

    public int getPresentId() {
        return presentId;
    }

    public String getTitle() {
        return title;
    }

    public User getFromUserId() {
        return fromUserId;
    }

    public Date getWhatDay() {
        return whatDay;
    }

    @Override
    public String toString() {
        return this.title + " from " +
                this.fromUserId.getFullName() + " " +
                new SimpleDateFormat("dd/MM/yyyy").format(this.whatDay);
    }
}
