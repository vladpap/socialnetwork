package ru.sbt.socialnetwork.dom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Award {
    private final int awardId;
    private final String title;
    private final Date whatDay;

    public Award(int awardId, String title, Date whatDay) {
        this.awardId = awardId;
        this.title = title;
        this.whatDay = whatDay;
    }

    public int getAwardId() {
        return awardId;
    }

    public String getTitle() {
        return title;
    }

    public Date getWhatDay() {
        return whatDay;
    }

    @Override
    public String toString() {
        return title + " " + new SimpleDateFormat("dd/MM/yyyy").format(this.whatDay);
    }
}
