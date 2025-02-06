package com.example.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;


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
    @Test
    @DisplayName("It should remove a given ghost from the list by its name")
    void testRemoveGhostFromList(){

        GhostHunter hunter = new GhostHunter();

        Ghost ghost1 = new Ghost("Alejandro", "Clase I", "Alto", "nulas", "06-02-205");
        Ghost ghost2 = new Ghost("Alex", "Clase II", "Bajo", "nulas", "06-02-205");
        
        hunter.captureGhost(ghost1);
        hunter.captureGhost(ghost2);
        hunter.freeAGhost("Alex");

        assertThat(hunter.getGhostContainer(), not(hasItem(ghost2)));
        
    }

}
