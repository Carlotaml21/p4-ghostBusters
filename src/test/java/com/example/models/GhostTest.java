package com.example.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GhostTest {
    private Ghost ghost; 

    @BeforeEach
    void setUp(){
        ghost = new Ghost("La llorona", "Clase I", "Bajo", "Persecucion", "06-02-2025");
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
        ghost.setGhostClass("Clase IV" );
        assertEquals("Clase IV", ghost.getGhostClass());
    }

    @Test
    void testGetDanger(){
        assertEquals("Bajo", ghost.getDanger());
    }

    @Test 
    void testSetDanger(){
        assertEquals("Bajo", ghost.getDanger()); 
        ghost.setDanger("Critico" );
        assertEquals("Critico", ghost.getDanger());
    }

    @Test
    void testGetAbilities(){
        assertEquals("Persecucion", ghost.getAbilities());
    }

    @Test 
    void testSetAbilities(){
        assertEquals("Persecucion", ghost.getAbilities()); 
        ghost.setAbilities("Poltergueist" );
        assertEquals("Poltergueist", ghost.getAbilities());
    }

    @Test
    void testGetCaptureDate(){
        assertEquals("06-02-2025", ghost.getCaptureDate());
    }

    @Test 
    void testSetCaptureDate(){
        assertEquals("06-02-2025", ghost.getCaptureDate()); 
        ghost.setCaptureDate("02-02-2025" );
        assertEquals("02-02-2025", ghost.getCaptureDate());
    }



}




