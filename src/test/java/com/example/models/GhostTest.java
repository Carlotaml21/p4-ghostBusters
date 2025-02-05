package com.example.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GhostTest {
    private Ghost ghost; 

    @BeforeEach
    void setUp(){
        ghost = new Ghost("La llorona");
    }

    @Test
    void testGetName(){
        assertEquals("La llorona", ghost.getName());
    }
}




