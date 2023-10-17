package com.javafortesters.chap006domainentities.examples;

import org.junit.Test;

import com.javafortesters.domainentities.User;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void userHasDefaultUsernameAndPassword() {

        User user = new User();

        assertEquals("default username expected", "username", user.getUsername());

        assertEquals("default password expected", "password", user.getPassword());
    }

    @Test
    public void canConstructWithUsernameAndPassword() {
        User user = new User("admin", "pa55w0rD");

        assertEquals("Given username expected", "admin", user.getUsername());
        assertEquals("Given password expected", "pa55w0rD", user.getPassword());

    }

    @Test
    public void canSetPasswordAfterConstructed() {

        User user = new User();

        user.setPassword("PaZZwor6");

        assertEquals("setter password expected", "PaZZwor6", user.getPassword());

    }

}
