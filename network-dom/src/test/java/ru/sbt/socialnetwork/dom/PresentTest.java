package ru.sbt.socialnetwork.dom;

import org.junit.Test;

import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class PresentTest {

    @Test
    public void presentTestCreate() {
        Date day = new GregorianCalendar(1972, 9, 30, 10, 10).getTime();
        Present present = new Present(10, "Flowers", new User(11, "Petrov", "Oleg"), day);
        assertEquals("Flowers from Oleg Petrov 30/10/1972", present.toString());
    }

}