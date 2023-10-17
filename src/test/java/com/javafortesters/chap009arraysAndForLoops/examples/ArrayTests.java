package com.javafortesters.chap009arraysAndForLoops.examples;
import com.javafortesters.domainentities.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayTests {

    public static void main (String args[]) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        User[] users = {user1, user2, user3};

        for(User user : users) {
            System.out.println(user);
        }

        User[] users100 = new User[100];

        for(int i = 0; i < 100; i++) {
            users100[i] = new User("user" + i, "password" + i);
        }

    }

    @Test
    public void workdaysArray() {
        String [] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workdays);
        Assert.assertEquals("Friday", workdays[0]);
        Assert.assertEquals("Monday", workdays[1]);
        Assert.assertEquals("Thursday", workdays[2]);
        Assert.assertEquals("Tuesday", workdays[3]);
        Assert.assertEquals("Wednesday", workdays[4]);
    }

    @Test
    public void workdaysArray2() {
        String [] workdays = {"monday", "Tuesday", "Wednesday", "thursday", "Friday"};
        Arrays.sort(workdays);
        Assert.assertEquals("Friday", workdays[0]);
        Assert.assertEquals("Tuesday", workdays[1]);
        Assert.assertEquals("Wednesday", workdays[2]);
        Assert.assertEquals("monday", workdays[3]);
        Assert.assertEquals("thursday", workdays[4]);
    }

}
