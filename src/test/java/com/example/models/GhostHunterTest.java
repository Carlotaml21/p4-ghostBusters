package com.example.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class GhostHunterTest {

    @Test
    @DisplayName("It should add a new ghost to the list")
    void testAddsNewGhostToTheList(){

        GhostHunter hunter = new GhostHunter();

        Ghost ghost = new Ghost("Alejandro", "Clase I", "Alto", "nulas", "06-02-205");

        assertThat(hunter.getGhostContainer().size(), is(0));

        hunter.captureGhost(ghost);

        assertThat(hunter.getGhostContainer().size(), is(1));

    } 
    
}
