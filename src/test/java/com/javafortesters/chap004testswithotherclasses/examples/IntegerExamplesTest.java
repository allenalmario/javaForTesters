package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration() {
        Integer four = new Integer(4);
        assertEquals("intValue returns int 4", 4, four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue returns int 5", 5, five.intValue());

        assertEquals("11 becomes b", "b", Integer.toHexString(11));
        assertEquals("10 becomes a", "a", Integer.toHexString(10));
        assertEquals("3 becomes 3", "3", Integer.toHexString(3));
        assertEquals("21 becomes 15", "15", Integer.toHexString(21));
    }

    @Test
    public void confirmMaxAndMinInteger() {
        assertEquals("MIN_VALUE equals -2147483648", -2147483648, Integer.MIN_VALUE);
        assertEquals("MAX_VALUE equals 2147483647", 2147483647, Integer.MAX_VALUE);
    }
}
