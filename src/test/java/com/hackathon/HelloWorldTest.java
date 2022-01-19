package com.hackathon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    public void getName() throws Exception {
        HelloWorld shahanas = new HelloWorld("Shahanas");
        assertEquals("Shahanas",shahanas.getName());
    }


}