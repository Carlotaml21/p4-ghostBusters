package com.example.models;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GhostTest {

    private Ghost ghost;

    @BeforeEach
    void setUp() {
        ghost = new Ghost("La llorona", "Clase I", "Bajo", "Persecucion", LocalDate.of(2025, 2, 6));
    }

    @Test
    void testGetName() {
        assertEquals("La llorona", ghost.getName());
    }

    @Test
    void testSetName() {
        assertEquals("La llorona", ghost.getName());
        ghost.setName("Fantasma del Nalon");
        assertEquals("Fantasma del Nalon", ghost.getName());
    }

    @Test
    void testGetGhostClass() {
        assertEquals("Clase I", ghost.getGhostClass());
    }

    @Test
    void testSetGhostClass() {
        assertEquals("Clase I", ghost.getGhostClass());
        ghost.setGhostClass("Clase IV");
        assertEquals("Clase IV", ghost.getGhostClass());
    }

    @Test
    void testGetDanger() {
        assertEquals("Bajo", ghost.getDanger());
    }

    @Test
    void testSetDanger() {
        assertEquals("Bajo", ghost.getDanger());
        ghost.setDanger("Critico");
        assertEquals("Critico", ghost.getDanger());
    }

    @Test
    void testGetAbilities() {
        assertEquals("Persecucion", ghost.getAbilities());
    }

    @Test
    void testSetAbilities() {
        assertEquals("Persecucion", ghost.getAbilities());
        ghost.setAbilities("Poltergueist");
        assertEquals("Poltergueist", ghost.getAbilities());
    }

    @Test
    void testGetCaptureDate() {
        assertEquals(LocalDate.of(2025, 2, 6), ghost.getCaptureDate());
    }

    @Test
    void testSetCaptureDate() {
        assertEquals(LocalDate.of(2025, 2, 6), ghost.getCaptureDate());
        
        ghost.setCaptureDate(LocalDate.of(2025, 2, 7));

        assertEquals(LocalDate.of(2025, 2, 7), ghost.getCaptureDate());
    }

    @Test
    void testGhostIdAutoIncrement() {
        Ghost ghost1 = new Ghost("La niña del pozo", "Clase IV", "Medio", "Asustar", LocalDate.of(2025, 2, 7));
        Ghost ghost2 = new Ghost("Casper", "Clase III", "Bajo", "Invisibilidad", LocalDate.of(2025, 2, 8));

        assertEquals(ghost1.getId() + 1, ghost2.getId());
        assertNotEquals(ghost1.getId(), ghost2.getId());
    }

}
