package com.deepak.controller;

import com.deepak.controllers.HelloController;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloControllerTest {
    private static HelloController helloController;

    @BeforeClass
    public static void setUp() {
        helloController = new HelloController();
    }

    @Test
    public void shouldReturnHello() {
        String actualResult = helloController.hello("Deepak").getBody();
        assertEquals("Hello, Deepak", actualResult);
    }
}
