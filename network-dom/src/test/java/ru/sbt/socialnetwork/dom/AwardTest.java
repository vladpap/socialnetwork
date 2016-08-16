package ru.sbt.socialnetwork.dom;

import org.junit.Test;

import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class AwardTest {

    @Test
    public void awardTestCreate() {
        Date day = new GregorianCalendar(1972, 9, 30, 10, 10).getTime();
        Award award = new Award(11, "10 correct answers", day);
        assertEquals("10 correct answers 30/10/1972", award.toString());
    }

}