package com.cognizant.junit;

import org.junit.*;

import static org.junit.Assert.*;

public class SampleTest {

    @Before
    public void setup() {
        System.out.println("Setting up...");
    }

    @Test
    public void testSomething() {
        assertEquals(10, 5 + 5);
    }

    @After
    public void teardown() {
        System.out.println("Cleaning up...");
    }
}
