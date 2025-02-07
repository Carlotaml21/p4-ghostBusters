package com.example.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;


public class GhostHunterTest {

    @Test
    @DisplayName("It should add a new ghost to the list")
    void testAddsNewGhostToTheList(){

        GhostHunter hunter = new GhostHunter();

        assertThat(hunter.getGhostContainer().size(), is(0));

        hunter.captureGhost("Alejandro", "Clase I", "Alto", "nulas", "06-02-2005");

        assertThat(hunter.getGhostContainer().size(), is(1));

    } 
    @Test
    @DisplayName("It should remove a given ghost from the list by its name")
    void testRemoveGhostFromList(){

        GhostHunter hunter = new GhostHunter();
        
        hunter.captureGhost("Alejandro", "Clase I", "Alto", "Nulas", "06-02-2005");
        hunter.captureGhost("Alex", "Clase II", "Bajo", "nulas", "06-02-2005");
        hunter.freeAGhost("Alex");

        assertThat(hunter.getGhostContainer(), not(hasItem(hasProperty("name", is("Alex")))));
        
    }
    @Test
    @DisplayName("It should filter ghosts by class")
    void testClassFilter(){

        GhostHunter hunter = new GhostHunter();

        hunter.captureGhost("Alejandro", "Clase I", "Alto", "nulas", "06-02-2005");
        hunter.captureGhost("Alex", "Clase II", "Bajo", "nulas", "06-02-2005");
        hunter.captureGhost("JC", "Clase I", "Alto", "nulas", "06-02-2005");
        hunter.captureGhost("Jaun", "Clase I", "Bajo", "nulas", "06-02-2005");

        assertThat(hunter.filterGhostByClass("Clase I"), not(hasItems(hasProperty("ghostClass", is("Clase II")))));

    }

    @Test
    @DisplayName("It should filter ghost by date")
    void testFilterByDate(){

        GhostHunter hunter = new GhostHunter();

        hunter.captureGhost("Alejandro", "Clase I", "Alto", "nulas", "06-02-2005");
        hunter.captureGhost("Alex", "Clase II", "Bajo", "nulas", "06-02-2005");
        hunter.captureGhost("JC", "Clase I", "Alto", "nulas", "07-02-2005");
        hunter.captureGhost("Jaun", "Clase I", "Bajo", "nulas", "07-02-2005");

        assertThat(hunter.filterGhostByMonth("07-02-2005"), not(hasItems(hasProperty("captureDate", is("06-02-2005")))));

    }

}
