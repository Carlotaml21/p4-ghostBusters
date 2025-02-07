package com.example.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.models.Ghost;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import java.util.List;

public class GhostHunterControllerTest {

    private Ghost ghost;
    private GhostHunterController hunterController;

    @BeforeEach
    void beforeEach(){
        ghost = new Ghost("Alejandro", "Clase I", "Bajo", "Nulas", "07-02-2025");
        hunterController = new GhostHunterController();
    }

    @Test
    @DisplayName("It should return the trapped ghost")
    void testCapturesGhost(){

        List<Ghost> capturedGhosts = hunterController.
        captureGhosts(ghost.getName(), ghost.getGhostClass(), ghost.getDanger(), ghost.getAbilities(), ghost.getCaptureDate());
        
        assertThat(capturedGhosts, hasItem(hasProperty("name", equalTo(ghost.getName()))));
        assertThat(capturedGhosts, hasItem(hasProperty("ghostClass", equalTo(ghost.getGhostClass()))));
        assertThat(capturedGhosts, hasItem(hasProperty("danger", equalTo(ghost.getDanger()))));
        assertThat(capturedGhosts, hasItem(hasProperty("abilities", equalTo(ghost.getAbilities()))));
        assertThat(capturedGhosts, hasItem(hasProperty("captureDate", equalTo(ghost.getCaptureDate()))));


    }
    @Test
    @DisplayName("It should return a list with the trapped ghosts")
    void testReturnsCapturedGhosts(){
        
        hunterController.captureGhosts(ghost.getName(), ghost.getGhostClass(), ghost.getDanger(), ghost.getAbilities(), ghost.getCaptureDate());

        assertThat(hunterController.getGhosts(), hasItem(hasProperty("name", equalTo(ghost.getName()))));
        assertThat(hunterController.getGhosts(), hasItem(hasProperty("ghostClass", equalTo(ghost.getGhostClass()))));
        assertThat(hunterController.getGhosts(), hasItem(hasProperty("danger", equalTo(ghost.getDanger()))));
        assertThat(hunterController.getGhosts(), hasItem(hasProperty("abilities", equalTo(ghost.getAbilities()))));
        assertThat(hunterController.getGhosts(), hasItem(hasProperty("captureDate", equalTo(ghost.getCaptureDate()))));
    }
    @Test
    @DisplayName("It should remove the selected ghost from the list")
    void testRemovesTrappedGhost(){

        Ghost ghost2 = new Ghost("Alex", "Clase II", "Alto", "Nulas", "07-02-2025");

        hunterController.captureGhosts(ghost.getName(), ghost.getGhostClass(), ghost.getDanger(), ghost.getAbilities(), ghost.getCaptureDate());
        hunterController.captureGhosts(ghost2.getName(), ghost2.getGhostClass(), ghost2.getDanger(), ghost2.getAbilities(), ghost2.getCaptureDate());

        hunterController.removeGhost(ghost.getName());

        assertThat(hunterController.getGhosts(), not(hasItem(hasProperty("name", equalTo(ghost.getName())))));

    }
    @Test
    @DisplayName("It should filter ghosts by class")
    void testFilteredByClass(){

        Ghost ghost2 = new Ghost("Alex", "Clase II", "Alto", "Nulas", "07-02-2025");
        Ghost ghost3 = new Ghost("Lucas", "Clase II", "Alto", "Nulas", "07-02-2025");

        hunterController.captureGhosts(ghost.getName(), ghost.getGhostClass(), ghost.getDanger(), ghost.getAbilities(), ghost.getCaptureDate());
        hunterController.captureGhosts(ghost2.getName(), ghost2.getGhostClass(), ghost2.getDanger(), ghost2.getAbilities(), ghost2.getCaptureDate());
        hunterController.captureGhosts(ghost3.getName(), ghost2.getGhostClass(), ghost2.getDanger(), ghost2.getAbilities(), ghost2.getCaptureDate());

        assertThat(hunterController.filteredGhostsByClass("Clase II"), not(hasItem(hasProperty("ghostClass", is("Clase I")))));
        assertThat(hunterController.filteredGhostsByClass("Clase I"), not(hasItem(hasProperty("ghostClass", is("Clase II")))));
    }
    @Test
    @DisplayName("It should filter ghosts by date")
    void testFilteredByDate(){

        hunterController.captureGhosts("Alejandro", "Clase I", "Alto", "nulas", "06-02-2005");
        hunterController.captureGhosts("Alex", "Clase II", "Bajo", "nulas", "06-02-2005");
        hunterController.captureGhosts("JC", "Clase I", "Alto", "nulas", "07-02-2005");
        hunterController.captureGhosts("Jaun", "Clase I", "Bajo", "nulas", "07-02-2005");

        assertThat(hunterController.filteredGhostsByDate("07-02-2005"), not(hasItems(hasProperty("captureDate", is("06-02-2005")))));
    }
    
}
