package com.example.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GhostTest {
    private Ghost ghost; 

    @BeforeEach
    void setUp(){
        ghost = new Ghost("La llorona", "Clase I");
    }

    @Test
    void testGetName(){
        assertEquals("La llorona", ghost.getName());
    }

    @Test 
    void testSetName(){
        assertEquals("La llorona", ghost.getName()); 
        ghost.setName("Fantasma del Nalon");
        assertEquals("Fantasma del Nalon", ghost.getName());
    }

    @Test
    void testGetGhostClass(){
        assertEquals("Clase I" , ghost.getGhostClass());
    }

    @Test 
    void testSetGhostClass(){
        assertEquals("Clase I", ghost.getGhostClass()); 
        ghost.setGhostClass("Clase IV");
        assertEquals("Clase IV", ghost.getGhostClass());
    }



}




