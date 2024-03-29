package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){
        assertEquals("getUrl() returns http://192.123.0.3:6", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("TestAppEnv returns 192.123.0.3", "192.123.0.3", TestAppEnv.DOMAIN);
        assertEquals("TestAppEnv returns 67", "67", TestAppEnv.PORT);
    }

}
